/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables.records;


import com.ethvm.db.tables.BlockMetricsHeader;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BlockMetricsHeaderRecord extends TableRecordImpl<BlockMetricsHeaderRecord> implements Record10<BigDecimal, String, Timestamp, Integer, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = 828119763;

    /**
     * Setter for <code>public.block_metrics_header.number</code>.
     */
    public BlockMetricsHeaderRecord setNumber(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metrics_header.number</code>.
     */
    public BigDecimal getNumber() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>public.block_metrics_header.hash</code>.
     */
    public BlockMetricsHeaderRecord setHash(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metrics_header.hash</code>.
     */
    public String getHash() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.block_metrics_header.timestamp</code>.
     */
    public BlockMetricsHeaderRecord setTimestamp(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metrics_header.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.block_metrics_header.block_time</code>.
     */
    public BlockMetricsHeaderRecord setBlockTime(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metrics_header.block_time</code>.
     */
    public Integer getBlockTime() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.block_metrics_header.num_uncles</code>.
     */
    public BlockMetricsHeaderRecord setNumUncles(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metrics_header.num_uncles</code>.
     */
    public Integer getNumUncles() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.block_metrics_header.difficulty</code>.
     */
    public BlockMetricsHeaderRecord setDifficulty(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metrics_header.difficulty</code>.
     */
    public BigDecimal getDifficulty() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>public.block_metrics_header.total_difficulty</code>.
     */
    public BlockMetricsHeaderRecord setTotalDifficulty(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metrics_header.total_difficulty</code>.
     */
    public BigDecimal getTotalDifficulty() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>public.block_metrics_header.total_gas_price</code>.
     */
    public BlockMetricsHeaderRecord setTotalGasPrice(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metrics_header.total_gas_price</code>.
     */
    public BigDecimal getTotalGasPrice() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>public.block_metrics_header.avg_gas_limit</code>.
     */
    public BlockMetricsHeaderRecord setAvgGasLimit(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metrics_header.avg_gas_limit</code>.
     */
    public BigDecimal getAvgGasLimit() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>public.block_metrics_header.avg_gas_price</code>.
     */
    public BlockMetricsHeaderRecord setAvgGasPrice(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metrics_header.avg_gas_price</code>.
     */
    public BigDecimal getAvgGasPrice() {
        return (BigDecimal) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<BigDecimal, String, Timestamp, Integer, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<BigDecimal, String, Timestamp, Integer, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return BlockMetricsHeader.BLOCK_METRICS_HEADER.NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return BlockMetricsHeader.BLOCK_METRICS_HEADER.HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return BlockMetricsHeader.BLOCK_METRICS_HEADER.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return BlockMetricsHeader.BLOCK_METRICS_HEADER.BLOCK_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return BlockMetricsHeader.BLOCK_METRICS_HEADER.NUM_UNCLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return BlockMetricsHeader.BLOCK_METRICS_HEADER.DIFFICULTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return BlockMetricsHeader.BLOCK_METRICS_HEADER.TOTAL_DIFFICULTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return BlockMetricsHeader.BLOCK_METRICS_HEADER.TOTAL_GAS_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return BlockMetricsHeader.BLOCK_METRICS_HEADER.AVG_GAS_LIMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return BlockMetricsHeader.BLOCK_METRICS_HEADER.AVG_GAS_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component1() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getBlockTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getNumUncles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getTotalDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getTotalGasPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getAvgGasLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getAvgGasPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value1() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getBlockTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getNumUncles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getTotalDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getTotalGasPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getAvgGasLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getAvgGasPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricsHeaderRecord value1(BigDecimal value) {
        setNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricsHeaderRecord value2(String value) {
        setHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricsHeaderRecord value3(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricsHeaderRecord value4(Integer value) {
        setBlockTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricsHeaderRecord value5(Integer value) {
        setNumUncles(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricsHeaderRecord value6(BigDecimal value) {
        setDifficulty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricsHeaderRecord value7(BigDecimal value) {
        setTotalDifficulty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricsHeaderRecord value8(BigDecimal value) {
        setTotalGasPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricsHeaderRecord value9(BigDecimal value) {
        setAvgGasLimit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricsHeaderRecord value10(BigDecimal value) {
        setAvgGasPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricsHeaderRecord values(BigDecimal value1, String value2, Timestamp value3, Integer value4, Integer value5, BigDecimal value6, BigDecimal value7, BigDecimal value8, BigDecimal value9, BigDecimal value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BlockMetricsHeaderRecord
     */
    public BlockMetricsHeaderRecord() {
        super(BlockMetricsHeader.BLOCK_METRICS_HEADER);
    }

    /**
     * Create a detached, initialised BlockMetricsHeaderRecord
     */
    public BlockMetricsHeaderRecord(BigDecimal number, String hash, Timestamp timestamp, Integer blockTime, Integer numUncles, BigDecimal difficulty, BigDecimal totalDifficulty, BigDecimal totalGasPrice, BigDecimal avgGasLimit, BigDecimal avgGasPrice) {
        super(BlockMetricsHeader.BLOCK_METRICS_HEADER);

        set(0, number);
        set(1, hash);
        set(2, timestamp);
        set(3, blockTime);
        set(4, numUncles);
        set(5, difficulty);
        set(6, totalDifficulty);
        set(7, totalGasPrice);
        set(8, avgGasLimit);
        set(9, avgGasPrice);
    }
}
