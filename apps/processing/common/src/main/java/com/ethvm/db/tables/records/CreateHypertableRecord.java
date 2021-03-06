/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables.records;


import com.ethvm.db.tables.CreateHypertable;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class CreateHypertableRecord extends TableRecordImpl<CreateHypertableRecord> implements Record4<Integer, String, String, Boolean> {

    private static final long serialVersionUID = 881689037;

    /**
     * Setter for <code>public.create_hypertable.hypertable_id</code>.
     */
    public CreateHypertableRecord setHypertableId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.create_hypertable.hypertable_id</code>.
     */
    public Integer getHypertableId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.create_hypertable.schema_name</code>.
     */
    public CreateHypertableRecord setSchemaName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.create_hypertable.schema_name</code>.
     */
    public String getSchemaName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.create_hypertable.table_name</code>.
     */
    public CreateHypertableRecord setTableName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.create_hypertable.table_name</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.create_hypertable.created</code>.
     */
    public CreateHypertableRecord setCreated(Boolean value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.create_hypertable.created</code>.
     */
    public Boolean getCreated() {
        return (Boolean) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Boolean> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CreateHypertable.CREATE_HYPERTABLE.HYPERTABLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CreateHypertable.CREATE_HYPERTABLE.SCHEMA_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CreateHypertable.CREATE_HYPERTABLE.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return CreateHypertable.CREATE_HYPERTABLE.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getHypertableId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSchemaName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getHypertableId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSchemaName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreateHypertableRecord value1(Integer value) {
        setHypertableId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreateHypertableRecord value2(String value) {
        setSchemaName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreateHypertableRecord value3(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreateHypertableRecord value4(Boolean value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreateHypertableRecord values(Integer value1, String value2, String value3, Boolean value4) {
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
     * Create a detached CreateHypertableRecord
     */
    public CreateHypertableRecord() {
        super(CreateHypertable.CREATE_HYPERTABLE);
    }

    /**
     * Create a detached, initialised CreateHypertableRecord
     */
    public CreateHypertableRecord(Integer hypertableId, String schemaName, String tableName, Boolean created) {
        super(CreateHypertable.CREATE_HYPERTABLE);

        set(0, hypertableId);
        set(1, schemaName);
        set(2, tableName);
        set(3, created);
    }
}
