/*
 * This file is generated by jOOQ.
*/
package gov.nist.csrk.jooq.tables.daos;


import gov.nist.csrk.jooq.tables.Baselinesecuritymappings;
import gov.nist.csrk.jooq.tables.records.BaselinesecuritymappingsRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class BaselinesecuritymappingsDao extends DAOImpl<BaselinesecuritymappingsRecord, gov.nist.csrk.jooq.tables.pojos.Baselinesecuritymappings, Integer> {

    /**
     * Create a new BaselinesecuritymappingsDao without any configuration
     */
    public BaselinesecuritymappingsDao() {
        super(Baselinesecuritymappings.BASELINESECURITYMAPPINGS, gov.nist.csrk.jooq.tables.pojos.Baselinesecuritymappings.class);
    }

    /**
     * Create a new BaselinesecuritymappingsDao with an attached configuration
     */
    public BaselinesecuritymappingsDao(Configuration configuration) {
        super(Baselinesecuritymappings.BASELINESECURITYMAPPINGS, gov.nist.csrk.jooq.tables.pojos.Baselinesecuritymappings.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(gov.nist.csrk.jooq.tables.pojos.Baselinesecuritymappings object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>Id IN (values)</code>
     */
    public List<gov.nist.csrk.jooq.tables.pojos.Baselinesecuritymappings> fetchById(Integer... values) {
        return fetch(Baselinesecuritymappings.BASELINESECURITYMAPPINGS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>Id = value</code>
     */
    public gov.nist.csrk.jooq.tables.pojos.Baselinesecuritymappings fetchOneById(Integer value) {
        return fetchOne(Baselinesecuritymappings.BASELINESECURITYMAPPINGS.ID, value);
    }

    /**
     * Fetch records that have <code>Level IN (values)</code>
     */
    public List<gov.nist.csrk.jooq.tables.pojos.Baselinesecuritymappings> fetchByLevel(Integer... values) {
        return fetch(Baselinesecuritymappings.BASELINESECURITYMAPPINGS.LEVEL, values);
    }

    /**
     * Fetch records that have <code>BaselineAuthor IN (values)</code>
     */
    public List<gov.nist.csrk.jooq.tables.pojos.Baselinesecuritymappings> fetchByBaselineauthor(Integer... values) {
        return fetch(Baselinesecuritymappings.BASELINESECURITYMAPPINGS.BASELINEAUTHOR, values);
    }

    /**
     * Fetch records that have <code>IsControlMap IN (values)</code>
     */
    public List<gov.nist.csrk.jooq.tables.pojos.Baselinesecuritymappings> fetchByIscontrolmap(Boolean... values) {
        return fetch(Baselinesecuritymappings.BASELINESECURITYMAPPINGS.ISCONTROLMAP, values);
    }

    /**
     * Fetch records that have <code>SpecsId IN (values)</code>
     */
    public List<gov.nist.csrk.jooq.tables.pojos.Baselinesecuritymappings> fetchBySpecsid(Integer... values) {
        return fetch(Baselinesecuritymappings.BASELINESECURITYMAPPINGS.SPECSID, values);
    }

    /**
     * Fetch records that have <code>ControlsId IN (values)</code>
     */
    public List<gov.nist.csrk.jooq.tables.pojos.Baselinesecuritymappings> fetchByControlsid(Integer... values) {
        return fetch(Baselinesecuritymappings.BASELINESECURITYMAPPINGS.CONTROLSID, values);
    }
}