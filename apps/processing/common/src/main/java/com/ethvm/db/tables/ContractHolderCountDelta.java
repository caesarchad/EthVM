/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables;


import com.ethvm.db.Indexes;
import com.ethvm.db.Keys;
import com.ethvm.db.Public;
import com.ethvm.db.tables.records.ContractHolderCountDeltaRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class ContractHolderCountDelta extends TableImpl<ContractHolderCountDeltaRecord> {

    private static final long serialVersionUID = 35010988;

    /**
     * The reference instance of <code>public.contract_holder_count_delta</code>
     */
    public static final ContractHolderCountDelta CONTRACT_HOLDER_COUNT_DELTA = new ContractHolderCountDelta();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContractHolderCountDeltaRecord> getRecordType() {
        return ContractHolderCountDeltaRecord.class;
    }

    /**
     * The column <code>public.contract_holder_count_delta.id</code>.
     */
    public final TableField<ContractHolderCountDeltaRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('contract_holder_count_delta_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.contract_holder_count_delta.contract_address</code>.
     */
    public final TableField<ContractHolderCountDeltaRecord, String> CONTRACT_ADDRESS = createField("contract_address", org.jooq.impl.SQLDataType.CHAR(42).nullable(false), this, "");

    /**
     * The column <code>public.contract_holder_count_delta.token_type</code>.
     */
    public final TableField<ContractHolderCountDeltaRecord, String> TOKEN_TYPE = createField("token_type", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>public.contract_holder_count_delta.block_number</code>.
     */
    public final TableField<ContractHolderCountDeltaRecord, BigDecimal> BLOCK_NUMBER = createField("block_number", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.contract_holder_count_delta.delta</code>.
     */
    public final TableField<ContractHolderCountDeltaRecord, Integer> DELTA = createField("delta", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.contract_holder_count_delta</code> table reference
     */
    public ContractHolderCountDelta() {
        this(DSL.name("contract_holder_count_delta"), null);
    }

    /**
     * Create an aliased <code>public.contract_holder_count_delta</code> table reference
     */
    public ContractHolderCountDelta(String alias) {
        this(DSL.name(alias), CONTRACT_HOLDER_COUNT_DELTA);
    }

    /**
     * Create an aliased <code>public.contract_holder_count_delta</code> table reference
     */
    public ContractHolderCountDelta(Name alias) {
        this(alias, CONTRACT_HOLDER_COUNT_DELTA);
    }

    private ContractHolderCountDelta(Name alias, Table<ContractHolderCountDeltaRecord> aliased) {
        this(alias, aliased, null);
    }

    private ContractHolderCountDelta(Name alias, Table<ContractHolderCountDeltaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ContractHolderCountDelta(Table<O> child, ForeignKey<O, ContractHolderCountDeltaRecord> key) {
        super(child, key, CONTRACT_HOLDER_COUNT_DELTA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CONTRACT_HOLDER_COUNT_DELTA_PKEY, Indexes.IDX_CONTRACT_HOLDER_COUNT_DELTA_BY_TOKEN_TYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ContractHolderCountDeltaRecord, Long> getIdentity() {
        return Keys.IDENTITY_CONTRACT_HOLDER_COUNT_DELTA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContractHolderCountDeltaRecord> getPrimaryKey() {
        return Keys.CONTRACT_HOLDER_COUNT_DELTA_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContractHolderCountDeltaRecord>> getKeys() {
        return Arrays.<UniqueKey<ContractHolderCountDeltaRecord>>asList(Keys.CONTRACT_HOLDER_COUNT_DELTA_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractHolderCountDelta as(String alias) {
        return new ContractHolderCountDelta(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractHolderCountDelta as(Name alias) {
        return new ContractHolderCountDelta(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ContractHolderCountDelta rename(String name) {
        return new ContractHolderCountDelta(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ContractHolderCountDelta rename(Name name) {
        return new ContractHolderCountDelta(name, null);
    }
}
