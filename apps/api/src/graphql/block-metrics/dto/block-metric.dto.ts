import { BlockMetric } from '@app/graphql/schema'
import { assignClean } from '@app/shared/utils'
import BigNumber from 'bignumber.js'
import {BlockMetricEntity} from '@app/orm/entities/block-metric.entity'

export class BlockMetricDto implements BlockMetric {

  avgGasLimit!: BigNumber
  avgGasPrice!: BigNumber
  avgTxFees!: BigNumber
  hash!: string
  blockTime!: number
  difficulty!: BigNumber
  numFailedTxs!: number
  numInternalTxs!: number
  numSuccessfulTxs!: number
  numUncles!: number
  number!: BigNumber
  timestamp!: Date
  totalDifficulty!: BigNumber
  totalGasPrice!: BigNumber
  totalTxFees!: BigNumber
  totalTxs!: number

  constructor(data: BlockMetricEntity) {
    assignClean(this, data)
  }

}
