/*
 * This file is generated by jOOQ.
*/
package gov.nist.csrc.jooq.tables.records;


import gov.nist.csrc.jooq.tables.Specs;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SpecsRecord extends UpdatableRecordImpl<SpecsRecord> implements Record5<Integer, Integer, String, String, String> {

    private static final long serialVersionUID = 375415132;

    /**
     * Setter for <code>Specs.Id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Specs.Id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Specs.ControlsId</code>.
     */
    public void setControlsid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Specs.ControlsId</code>.
     */
    public Integer getControlsid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Specs.SpecificationName</code>.
     */
    public void setSpecificationname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Specs.SpecificationName</code>.
     */
    public String getSpecificationname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Specs.Description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Specs.Description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Specs.Guidance</code>.
     */
    public void setGuidance(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Specs.Guidance</code>.
     */
    public String getGuidance() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Specs.SPECS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Specs.SPECS.CONTROLSID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Specs.SPECS.SPECIFICATIONNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Specs.SPECS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Specs.SPECS.GUIDANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getControlsid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSpecificationname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getGuidance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getControlsid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSpecificationname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getGuidance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecsRecord value2(Integer value) {
        setControlsid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecsRecord value3(String value) {
        setSpecificationname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecsRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecsRecord value5(String value) {
        setGuidance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecsRecord values(Integer value1, Integer value2, String value3, String value4, String value5) {
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
     * Create a detached SpecsRecord
     */
    public SpecsRecord() {
        super(Specs.SPECS);
    }

    /**
     * Create a detached, initialised SpecsRecord
     */
    public SpecsRecord(Integer id, Integer controlsid, String specificationname, String description, String guidance) {
        super(Specs.SPECS);

        set(0, id);
        set(1, controlsid);
        set(2, specificationname);
        set(3, description);
        set(4, guidance);
    }
}