/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables;


import com.ethvm.db.Indexes;
import com.ethvm.db.Keys;
import com.ethvm.db.Public;
import com.ethvm.db.tables.records.ContractMetadataRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class ContractMetadata extends TableImpl<ContractMetadataRecord> {

    private static final long serialVersionUID = 1000402495;

    /**
     * The reference instance of <code>public.contract_metadata</code>
     */
    public static final ContractMetadata CONTRACT_METADATA = new ContractMetadata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContractMetadataRecord> getRecordType() {
        return ContractMetadataRecord.class;
    }

    /**
     * The column <code>public.contract_metadata.address</code>.
     */
    public final TableField<ContractMetadataRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.CHAR(42).nullable(false), this, "");

    /**
     * The column <code>public.contract_metadata.block_number</code>.
     */
    public final TableField<ContractMetadataRecord, BigDecimal> BLOCK_NUMBER = createField("block_number", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.contract_metadata.name</code>.
     */
    public final TableField<ContractMetadataRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>public.contract_metadata.symbol</code>.
     */
    public final TableField<ContractMetadataRecord, String> SYMBOL = createField("symbol", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>public.contract_metadata.decimals</code>.
     */
    public final TableField<ContractMetadataRecord, Integer> DECIMALS = createField("decimals", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.contract_metadata.total_supply</code>.
     */
    public final TableField<ContractMetadataRecord, BigDecimal> TOTAL_SUPPLY = createField("total_supply", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * Create a <code>public.contract_metadata</code> table reference
     */
    public ContractMetadata() {
        this(DSL.name("contract_metadata"), null);
    }

    /**
     * Create an aliased <code>public.contract_metadata</code> table reference
     */
    public ContractMetadata(String alias) {
        this(DSL.name(alias), CONTRACT_METADATA);
    }

    /**
     * Create an aliased <code>public.contract_metadata</code> table reference
     */
    public ContractMetadata(Name alias) {
        this(alias, CONTRACT_METADATA);
    }

    private ContractMetadata(Name alias, Table<ContractMetadataRecord> aliased) {
        this(alias, aliased, null);
    }

    private ContractMetadata(Name alias, Table<ContractMetadataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ContractMetadata(Table<O> child, ForeignKey<O, ContractMetadataRecord> key) {
        super(child, key, CONTRACT_METADATA);
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
        return Arrays.<Index>asList(Indexes.CONTRACT_METADATA_PKEY, Indexes.IDX_CONTRACT_METADATA_BY_BLOCK_NUMBER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContractMetadataRecord> getPrimaryKey() {
        return Keys.CONTRACT_METADATA_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContractMetadataRecord>> getKeys() {
        return Arrays.<UniqueKey<ContractMetadataRecord>>asList(Keys.CONTRACT_METADATA_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractMetadata as(String alias) {
        return new ContractMetadata(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractMetadata as(Name alias) {
        return new ContractMetadata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ContractMetadata rename(String name) {
        return new ContractMetadata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ContractMetadata rename(Name name) {
        return new ContractMetadata(name, null);
    }
}
