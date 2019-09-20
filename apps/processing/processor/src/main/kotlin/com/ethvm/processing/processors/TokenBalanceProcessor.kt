package com.ethvm.processing.processors

import com.ethvm.avro.capture.BlockRecord
import com.ethvm.avro.capture.CanonicalKeyRecord
import com.ethvm.avro.processing.TokenType
import com.ethvm.processing.cache.FungibleBalanceCache
import com.ethvm.processing.cache.NonFungibleBalanceCache
import com.ethvm.processing.extensions.toBalanceDeltas
import mu.KotlinLogging
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.jooq.DSLContext
import org.koin.core.inject
import org.koin.core.qualifier.named
import java.math.BigInteger
import java.util.Properties

class TokenBalanceProcessor : AbstractProcessor<BlockRecord>("token-balance-processor") {

  override val logger = KotlinLogging.logger {}

  private val topicBlocks: String by inject(named("topicBlocks"))

  override val kafkaProps: Properties = Properties()
    .apply {
      put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, 16)
    }

  override val topics = listOf(topicBlocks)

  private val fungibleBalanceCache = FungibleBalanceCache(diskDb, TokenType.ERC20, processorId)
  private val nonFungibleBalanceCache = NonFungibleBalanceCache(diskDb, TokenType.ERC721, processorId)

  override fun blockHashFor(value: BlockRecord): String = value.header.hash

  override fun initialise(txCtx: DSLContext, latestBlockNumber: BigInteger) {

    val futures = listOf(
      executor.submit { fungibleBalanceCache.initialise(txCtx) },
      executor.submit { nonFungibleBalanceCache.initialise(txCtx) }
    )

    // block until caches have finished initialising
    futures.forEach { it.get() }
  }

  override fun reset(txCtx: DSLContext) {
    fungibleBalanceCache.reset(txCtx)
    nonFungibleBalanceCache.reset(txCtx)
  }

  override fun rewindUntil(txCtx: DSLContext, blockNumber: BigInteger) {
    fungibleBalanceCache.rewindUntil(txCtx, blockNumber)
    nonFungibleBalanceCache.rewindUntil(txCtx, blockNumber)
  }

  override fun process(txCtx: DSLContext, record: ConsumerRecord<CanonicalKeyRecord, BlockRecord>) {

    val block = record.value()

    val deltaRecords = block
      .receipts
      .map { it.toBalanceDeltas(block) }
      .flatten()

    txCtx.batchInsert(deltaRecords).execute()

    deltaRecords
      .forEach { delta ->

        when (val tokenType = delta.tokenType) {

          TokenType.ERC20.toString() ->
            fungibleBalanceCache.add(delta)

          TokenType.ERC721.toString() ->
            nonFungibleBalanceCache.assign(delta)

          else -> throw UnsupportedOperationException("Unexpected token type: $tokenType")
        }
      }

    // write changes to db

    fungibleBalanceCache.writeToDb(txCtx)
    nonFungibleBalanceCache.writeToDb(txCtx)
  }
}
