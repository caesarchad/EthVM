/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables.records;


import com.ethvm.db.tables.AddressContractsCreatedCountDelta;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AddressContractsCreatedCountDeltaRecord extends UpdatableRecordImpl<AddressContractsCreatedCountDeltaRecord> implements Record4<Long, String, BigDecimal, Integer> {

    private static final long serialVersionUID = 1222510553;

    /**
     * Setter for <code>public.address_contracts_created_count_delta.id</code>.
     */
    public AddressContractsCreatedCountDeltaRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.address_contracts_created_count_delta.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.address_contracts_created_count_delta.address</code>.
     */
    public AddressContractsCreatedCountDeltaRecord setAddress(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.address_contracts_created_count_delta.address</code>.
     */
    public String getAddress() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.address_contracts_created_count_delta.block_number</code>.
     */
    public AddressContractsCreatedCountDeltaRecord setBlockNumber(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.address_contracts_created_count_delta.block_number</code>.
     */
    public BigDecimal getBlockNumber() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>public.address_contracts_created_count_delta.delta</code>.
     */
    public AddressContractsCreatedCountDeltaRecord setDelta(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.address_contracts_created_count_delta.delta</code>.
     */
    public Integer getDelta() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, BigDecimal, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, BigDecimal, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return AddressContractsCreatedCountDelta.ADDRESS_CONTRACTS_CREATED_COUNT_DELTA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AddressContractsCreatedCountDelta.ADDRESS_CONTRACTS_CREATED_COUNT_DELTA.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return AddressContractsCreatedCountDelta.ADDRESS_CONTRACTS_CREATED_COUNT_DELTA.BLOCK_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return AddressContractsCreatedCountDelta.ADDRESS_CONTRACTS_CREATED_COUNT_DELTA.DELTA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getBlockNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getDelta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getBlockNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDelta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressContractsCreatedCountDeltaRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressContractsCreatedCountDeltaRecord value2(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressContractsCreatedCountDeltaRecord value3(BigDecimal value) {
        setBlockNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressContractsCreatedCountDeltaRecord value4(Integer value) {
        setDelta(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressContractsCreatedCountDeltaRecord values(Long value1, String value2, BigDecimal value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AddressContractsCreatedCountDeltaRecord
     */
    public AddressContractsCreatedCountDeltaRecord() {
        super(AddressContractsCreatedCountDelta.ADDRESS_CONTRACTS_CREATED_COUNT_DELTA);
    }

    /**
     * Create a detached, initialised AddressContractsCreatedCountDeltaRecord
     */
    public AddressContractsCreatedCountDeltaRecord(Long id, String address, BigDecimal blockNumber, Integer delta) {
        super(AddressContractsCreatedCountDelta.ADDRESS_CONTRACTS_CREATED_COUNT_DELTA);

        set(0, id);
        set(1, address);
        set(2, blockNumber);
        set(3, delta);
    }
}
