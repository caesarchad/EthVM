import {assignClean} from '@app/shared/utils'
import BigNumber from 'bignumber.js'
import {Entity, JoinColumn, ManyToOne, PrimaryColumn} from 'typeorm'
import {Column} from 'typeorm/decorator/columns/Column'
import {BigNumberTransformer} from '../transformers/big-number.transformer'
import {DateTransformer} from '@app/orm/transformers/date.transformer'
import {BlockHeaderEntity} from '@app/orm/entities/block-header.entity'
import {BalanceDeltaEntity} from '@app/orm/entities/balance-delta.entity'

@Entity('uncle')
export class UncleEntity {

  constructor(data: any) {
    assignClean(this, data)
  }

  @PrimaryColumn({ type: 'char', length: 66, readonly: true })
  hash!: string

  @Column({ type: 'int', readonly: true })
  index!: number

  @Column({ type: 'char', length: 66, readonly: true })
  nephewHash!: string

  @Column({ type: 'numeric', readonly: true, transformer: new BigNumberTransformer() })
  number!: BigNumber

  @Column({ type: 'numeric', readonly: true, transformer: new BigNumberTransformer() })
  height!: BigNumber

  @Column({ type: 'char', length: 66, readonly: true })
  parentHash!: string

  @Column({ type: 'numeric', readonly: true, transformer: new BigNumberTransformer() })
  nonce?: BigNumber

  @Column({ type: 'char', length: 66, readonly: true })
  sha3Uncles!: string

  @Column({ type: 'char', length: 514, readonly: true })
  logsBloom!: string

  @Column({ type: 'char', length: 66, readonly: true })
  transactionsRoot!: string

  @Column({ type: 'char', length: 66, readonly: true })
  stateRoot!: string

  @Column({ type: 'char', length: 66, readonly: true })
  receiptsRoot!: string

  @Column({ type: 'char', length: 42, readonly: true })
  author!: string

  @Column({ type: 'numeric', readonly: true, transformer: new BigNumberTransformer() })
  difficulty!: BigNumber

  @Column({ type: 'numeric', readonly: true, transformer: new BigNumberTransformer() })
  totalDifficulty!: BigNumber

  @Column({ type: 'text', readonly: true })
  extraData?: string

  @Column({ type: 'numeric', readonly: true, transformer: new BigNumberTransformer() })
  gasLimit!: BigNumber

  @Column({ type: 'numeric', readonly: true, transformer: new BigNumberTransformer() })
  gasUsed!: BigNumber

  @Column({ type: 'timestamp', readonly: true, transformer: new DateTransformer() })
  timestamp!: Date

  @Column({ type: 'bigint', readonly: true })
  size!: string

  @ManyToOne(type => BlockHeaderEntity, block => block.uncles)
  @JoinColumn({
    name: 'nephewHash',
    referencedColumnName: 'hash',
  })
  blockHeader!: BlockHeaderEntity

  // Complicated join on two fields so cheaper to query separately and manually attach
  reward?: BalanceDeltaEntity

}
