/*
 * This file is generated by jOOQ.
*/
package gov.nist.csrk.jooq.tables;


import gov.nist.csrk.jooq.DefaultSchema;
import gov.nist.csrk.jooq.Keys;
import gov.nist.csrk.jooq.tables.records.PrioritiesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
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
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Priorities extends TableImpl<PrioritiesRecord> {

    private static final long serialVersionUID = 1295728054;

    /**
     * The reference instance of <code>Priorities</code>
     */
    public static final Priorities PRIORITIES = new Priorities();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PrioritiesRecord> getRecordType() {
        return PrioritiesRecord.class;
    }

    /**
     * The column <code>Priorities.Id</code>.
     */
    public final TableField<PrioritiesRecord, Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Priorities.Name</code>.
     */
    public final TableField<PrioritiesRecord, String> NAME = createField("Name", org.jooq.impl.SQLDataType.CHAR(8000).nullable(false), this, "");

    /**
     * The column <code>Priorities.Description</code>.
     */
    public final TableField<PrioritiesRecord, String> DESCRIPTION = createField("Description", org.jooq.impl.SQLDataType.CHAR(8000).nullable(false), this, "");

    /**
     * Create a <code>Priorities</code> table reference
     */
    public Priorities() {
        this(DSL.name("Priorities"), null);
    }

    /**
     * Create an aliased <code>Priorities</code> table reference
     */
    public Priorities(String alias) {
        this(DSL.name(alias), PRIORITIES);
    }

    /**
     * Create an aliased <code>Priorities</code> table reference
     */
    public Priorities(Name alias) {
        this(alias, PRIORITIES);
    }

    private Priorities(Name alias, Table<PrioritiesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Priorities(Name alias, Table<PrioritiesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PrioritiesRecord> getPrimaryKey() {
        return Keys.PK_PRIORITIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PrioritiesRecord>> getKeys() {
        return Arrays.<UniqueKey<PrioritiesRecord>>asList(Keys.PK_PRIORITIES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Priorities as(String alias) {
        return new Priorities(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Priorities as(Name alias) {
        return new Priorities(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Priorities rename(String name) {
        return new Priorities(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Priorities rename(Name name) {
        return new Priorities(name, null);
    }
}
