/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables.records;


import com.ethvm.db.tables.AddDimension;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class AddDimensionRecord extends TableRecordImpl<AddDimensionRecord> implements Record5<Integer, String, String, String, Boolean> {

    private static final long serialVersionUID = -1292883876;

    /**
     * Setter for <code>public.add_dimension.dimension_id</code>.
     */
    public AddDimensionRecord setDimensionId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.add_dimension.dimension_id</code>.
     */
    public Integer getDimensionId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.add_dimension.schema_name</code>.
     */
    public AddDimensionRecord setSchemaName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.add_dimension.schema_name</code>.
     */
    public String getSchemaName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.add_dimension.table_name</code>.
     */
    public AddDimensionRecord setTableName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.add_dimension.table_name</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.add_dimension.column_name</code>.
     */
    public AddDimensionRecord setColumnName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.add_dimension.column_name</code>.
     */
    public String getColumnName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.add_dimension.created</code>.
     */
    public AddDimensionRecord setCreated(Boolean value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.add_dimension.created</code>.
     */
    public Boolean getCreated() {
        return (Boolean) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, Boolean> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, Boolean> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AddDimension.ADD_DIMENSION.DIMENSION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AddDimension.ADD_DIMENSION.SCHEMA_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AddDimension.ADD_DIMENSION.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return AddDimension.ADD_DIMENSION.COLUMN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return AddDimension.ADD_DIMENSION.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getDimensionId();
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
    public String component4() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDimensionId();
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
    public String value4() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddDimensionRecord value1(Integer value) {
        setDimensionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddDimensionRecord value2(String value) {
        setSchemaName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddDimensionRecord value3(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddDimensionRecord value4(String value) {
        setColumnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddDimensionRecord value5(Boolean value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddDimensionRecord values(Integer value1, String value2, String value3, String value4, Boolean value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AddDimensionRecord
     */
    public AddDimensionRecord() {
        super(AddDimension.ADD_DIMENSION);
    }

    /**
     * Create a detached, initialised AddDimensionRecord
     */
    public AddDimensionRecord(Integer dimensionId, String schemaName, String tableName, String columnName, Boolean created) {
        super(AddDimension.ADD_DIMENSION);

        set(0, dimensionId);
        set(1, schemaName);
        set(2, tableName);
        set(3, columnName);
        set(4, created);
    }
}
