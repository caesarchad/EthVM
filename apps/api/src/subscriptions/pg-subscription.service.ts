import {BlockService} from '@app/dao/block.service'
import {ConfigService} from '@app/shared/config.service'
import {Inject, Injectable} from '@nestjs/common'
import {PubSub} from 'graphql-subscriptions'
import createSubscriber from 'pg-listen'
import {Observable, Subject} from 'rxjs'
import {bufferTime, filter, map} from 'rxjs/operators'
import {Logger} from 'winston'
import {TxService} from '@app/dao/tx.service'
import {BlockMetricsService} from '@app/dao/block-metrics.service'
import {InjectEntityManager} from '@nestjs/typeorm'
import {EntityManager} from 'typeorm'
import {MetadataService} from '@app/dao/metadata.service';
import BigNumber from 'bignumber.js';

export interface SyncStatusPayload {
  component: string,
  block_number: string
}

export class PgEvent {

  public readonly table: string
  public readonly action: string
  public readonly payload: any

  constructor(data: any) {
    this.table = data.table
    this.action = data.action
    this.payload = data.payload
  }

}

function inputIsPgEvent(input: any): input is PgEvent {
  return input instanceof PgEvent
}

// tslint:disable-next-line:no-shadowed-variable
function isPgEvent<PgEvent>() {
  return (source$: Observable<any>) => source$.pipe(
    filter(inputIsPgEvent),
  )
}

// tslint:disable-next-line:no-shadowed-variable
function isSyncStatusEvent<PgEvent>() {
  return (source$: Observable<any>) => source$.pipe(
    filter(inputIsPgEvent),
    filter(e => e.table === 'sync_status'),
  )
}

@Injectable()
export class PgSubscriptionService {

  private readonly dbUrl: string

  private syncStatusMap = new Map<string, BigNumber>()
  private isSyncing?: boolean

  constructor(
    @Inject('PUB_SUB') private readonly pubSub: PubSub,
    @Inject('winston') private readonly logger: Logger,
    private readonly config: ConfigService,
    private readonly metadataService: MetadataService,
    private readonly blockService: BlockService,
    private readonly transactionService: TxService,
    private readonly blockMetricsService: BlockMetricsService,
    @InjectEntityManager() private readonly entityManager: EntityManager,
  ) {

    this.dbUrl = config.db.url

    this.initKeepAlive()
    this.init()
  }

  private initKeepAlive() {

    // we publish a keep alive every 30 seconds to prevent the web socket from closing
    const periodMs = 30000;

    const { pubSub } = this

    const keepAlive = () => {
      pubSub.publish('keepAlive', true);
      setTimeout(keepAlive, periodMs)
    }

    setTimeout(keepAlive, periodMs)
  }

  private async init() {

    const {dbUrl, blockService, transactionService, logger, pubSub, entityManager, metadataService, blockMetricsService} = this

    // Build sync status map with latest values

    const syncStatuses = await metadataService.latestSyncStatus()
    syncStatuses.forEach(status => {
      this.syncStatusMap.set(status.component, status.blockNumber)
    })

    // Determine if we are currently syncing
    this.isSyncing = await metadataService.isSyncing()

    const events$ = Observable.create(
      async observer => {
        try {
          const subscriber = createSubscriber({connectionString: dbUrl})

          subscriber.notifications.on('events', e => observer.next(e))

          subscriber.events.on('error', err => {
            console.error('pg sub error', err)
            observer.error(err)
          })

          await subscriber.connect()
          await subscriber.listenTo('events')

          return () => {
            subscriber.close()
          }
        } catch (err) {
          console.error('Pg sub error', err)
          observer.error(err)
        }
      })

    const blockHashes$ = new Subject<string>()
    const syncStatusUpdates$ = new Subject<boolean>()

    const pgEvents$ = events$
      .pipe(
        map(event => new PgEvent(event)),
        isPgEvent(),
      )

    //

    pgEvents$
      .pipe(isSyncStatusEvent())
      .subscribe(event => this.onSyncStatusUpdate(event, blockHashes$, syncStatusUpdates$))

    blockHashes$
      .pipe(
        bufferTime(100),
        filter(blockHashes => blockHashes.length > 0),
      )
      .subscribe(async blockHashes => {

        logger.info(
          `[Subscription service] New blocks available, count = %d, hashes = %s`,
          blockHashes.length,
          blockHashes,
        )

        // clear query cache
        await entityManager.connection.queryResultCache!.clear()

        const blockSummaries = await blockService.findSummariesByBlockHash(blockHashes, false)

        const publishPromises = blockSummaries.map(async blockSummary => {

          // get data
          const txSummaries = await transactionService.findSummariesByHash(blockSummary.transactionHashes || [])
          const hashRate = await blockService.calculateHashRate(false, blockSummary.number)
          const blockMetric = await blockMetricsService.findBlockMetric(blockSummary.hash, blockSummary.number, blockSummary.timestamp)

          const promises: Promise<void>[] = [];

          // publish events

          promises.push(pubSub.publish('newBlock', blockSummary))

          promises.push(pubSub.publish('newTransactions', txSummaries))

          txSummaries.forEach(txSummary => {
            promises.push(pubSub.publish('newTransaction', txSummary))
          })

          promises.push(pubSub.publish('hashRate', hashRate))

          promises.push(pubSub.publish('newBlockMetric', blockMetric))

          return Promise.all(promises)
        })

        // await on all the promises, throwing an error if any of them failed
        await Promise.all(publishPromises);
      })

    syncStatusUpdates$
      .subscribe(async syncStatus => {
        return pubSub.publish('isSyncing', syncStatus)
      })
  }

  private async onSyncStatusUpdate(event: PgEvent, blockHashes$: Subject<string>, syncStatusUpdates$: Subject<boolean>) {

    const {blockService, metadataService, isSyncing} = this
    const payload = event.payload as SyncStatusPayload

    const prevBlockNumber = this.lowestBlockNumber() || new BigNumber(-1)

    // Update local map and find new lowest block number
    this.syncStatusMap.set(payload.component, new BigNumber(payload.block_number))
    const newBlockNumber = this.lowestBlockNumber()!

    // This will detect when a new block is published or when a fork happens
    // TODO unless fork happens after only one block
    if (!newBlockNumber.isEqualTo(prevBlockNumber)) {

      // Determine if sync status event should be published
      const newSyncStatus = metadataService.calculateIsSyncing(Array.from(this.syncStatusMap.values()))
      if (newSyncStatus !== isSyncing) {
        // Publish event and update state
        syncStatusUpdates$.next(newSyncStatus)
        this.isSyncing = newSyncStatus
      }

      if (this.isSyncing) { // This is to prevent flooding clients when we are syncing
        return
      }

      let numberToPublish = prevBlockNumber.plus(1)

      while (numberToPublish.lte(newBlockNumber)) {

        const block = await blockService.findByNumber(numberToPublish, newBlockNumber)

        if (block != null) {
          blockHashes$.next(block.hash)
        }
        numberToPublish = numberToPublish.plus(1)
      }

    }

  }

  private lowestBlockNumber(): BigNumber | undefined {
    const blockNumbers = Array.from(this.syncStatusMap.values())
    if (!(blockNumbers && blockNumbers.length )) {
      return undefined
    }
    return BigNumber.minimum(...blockNumbers)
  }

}
