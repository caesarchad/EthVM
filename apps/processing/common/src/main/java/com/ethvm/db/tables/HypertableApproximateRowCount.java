/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables;


import com.ethvm.db.Public;
import com.ethvm.db.tables.records.HypertableApproximateRowCountRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class HypertableApproximateRowCount extends TableImpl<HypertableApproximateRowCountRecord> {

    private static final long serialVersionUID = -1216704228;

    /**
     * The reference instance of <code>public.hypertable_approximate_row_count</code>
     */
    public static final HypertableApproximateRowCount HYPERTABLE_APPROXIMATE_ROW_COUNT = new HypertableApproximateRowCount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HypertableApproximateRowCountRecord> getRecordType() {
        return HypertableApproximateRowCountRecord.class;
    }

    /**
     * The column <code>public.hypertable_approximate_row_count.schema_name</code>.
     */
    public final TableField<HypertableApproximateRowCountRecord, String> SCHEMA_NAME = createField("schema_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.hypertable_approximate_row_count.table_name</code>.
     */
    public final TableField<HypertableApproximateRowCountRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.hypertable_approximate_row_count.row_estimate</code>.
     */
    public final TableField<HypertableApproximateRowCountRecord, Long> ROW_ESTIMATE = createField("row_estimate", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.hypertable_approximate_row_count</code> table reference
     */
    public HypertableApproximateRowCount() {
        this(DSL.name("hypertable_approximate_row_count"), null);
    }

    /**
     * Create an aliased <code>public.hypertable_approximate_row_count</code> table reference
     */
    public HypertableApproximateRowCount(String alias) {
        this(DSL.name(alias), HYPERTABLE_APPROXIMATE_ROW_COUNT);
    }

    /**
     * Create an aliased <code>public.hypertable_approximate_row_count</code> table reference
     */
    public HypertableApproximateRowCount(Name alias) {
        this(alias, HYPERTABLE_APPROXIMATE_ROW_COUNT);
    }

    private HypertableApproximateRowCount(Name alias, Table<HypertableApproximateRowCountRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private HypertableApproximateRowCount(Name alias, Table<HypertableApproximateRowCountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> HypertableApproximateRowCount(Table<O> child, ForeignKey<O, HypertableApproximateRowCountRecord> key) {
        super(child, key, HYPERTABLE_APPROXIMATE_ROW_COUNT);
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
    public HypertableApproximateRowCount as(String alias) {
        return new HypertableApproximateRowCount(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HypertableApproximateRowCount as(Name alias) {
        return new HypertableApproximateRowCount(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public HypertableApproximateRowCount rename(String name) {
        return new HypertableApproximateRowCount(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public HypertableApproximateRowCount rename(Name name) {
        return new HypertableApproximateRowCount(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public HypertableApproximateRowCount call(Object mainTable) {
        return new HypertableApproximateRowCount(DSL.name(getName()), null, new Field[] { 
              DSL.val(mainTable, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\"").defaultValue(org.jooq.impl.DSL.field("NULL::regclass", org.jooq.impl.SQLDataType.OTHER)))
        });
    }

    /**
     * Call this table-valued function
     */
    public HypertableApproximateRowCount call(Field<Object> mainTable) {
        return new HypertableApproximateRowCount(DSL.name(getName()), null, new Field[] { 
              mainTable
        });
    }
}
