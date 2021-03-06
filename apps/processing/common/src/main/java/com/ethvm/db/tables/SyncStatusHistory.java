/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables;


import com.ethvm.db.Indexes;
import com.ethvm.db.Keys;
import com.ethvm.db.Public;
import com.ethvm.db.tables.records.SyncStatusHistoryRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
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
public class SyncStatusHistory extends TableImpl<SyncStatusHistoryRecord> {

    private static final long serialVersionUID = -1148014972;

    /**
     * The reference instance of <code>public.sync_status_history</code>
     */
    public static final SyncStatusHistory SYNC_STATUS_HISTORY = new SyncStatusHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SyncStatusHistoryRecord> getRecordType() {
        return SyncStatusHistoryRecord.class;
    }

    /**
     * The column <code>public.sync_status_history.component</code>.
     */
    public final TableField<SyncStatusHistoryRecord, String> COMPONENT = createField("component", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.sync_status_history.block_number</code>.
     */
    public final TableField<SyncStatusHistoryRecord, BigDecimal> BLOCK_NUMBER = createField("block_number", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.sync_status_history.timestamp</code>.
     */
    public final TableField<SyncStatusHistoryRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.sync_status_history.block_timestamp</code>.
     */
    public final TableField<SyncStatusHistoryRecord, Timestamp> BLOCK_TIMESTAMP = createField("block_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>public.sync_status_history</code> table reference
     */
    public SyncStatusHistory() {
        this(DSL.name("sync_status_history"), null);
    }

    /**
     * Create an aliased <code>public.sync_status_history</code> table reference
     */
    public SyncStatusHistory(String alias) {
        this(DSL.name(alias), SYNC_STATUS_HISTORY);
    }

    /**
     * Create an aliased <code>public.sync_status_history</code> table reference
     */
    public SyncStatusHistory(Name alias) {
        this(alias, SYNC_STATUS_HISTORY);
    }

    private SyncStatusHistory(Name alias, Table<SyncStatusHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private SyncStatusHistory(Name alias, Table<SyncStatusHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SyncStatusHistory(Table<O> child, ForeignKey<O, SyncStatusHistoryRecord> key) {
        super(child, key, SYNC_STATUS_HISTORY);
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
        return Arrays.<Index>asList(Indexes.IDX_SYNC_STATUS_HISTORY, Indexes.SYNC_STATUS_HISTORY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SyncStatusHistoryRecord> getPrimaryKey() {
        return Keys.SYNC_STATUS_HISTORY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SyncStatusHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<SyncStatusHistoryRecord>>asList(Keys.SYNC_STATUS_HISTORY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncStatusHistory as(String alias) {
        return new SyncStatusHistory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncStatusHistory as(Name alias) {
        return new SyncStatusHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SyncStatusHistory rename(String name) {
        return new SyncStatusHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SyncStatusHistory rename(Name name) {
        return new SyncStatusHistory(name, null);
    }
}
