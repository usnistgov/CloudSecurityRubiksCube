/*
 * This file is generated by jOOQ.
*/
package gov.nist.csrc.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class Baselines implements Serializable {

    private static final long serialVersionUID = 419119315;

    private Integer id;
    private Boolean impactlow;
    private Boolean impactmoderate;
    private Boolean impacthigh;
    private String  description;

    public Baselines() {}

    public Baselines(Baselines value) {
        this.id = value.id;
        this.impactlow = value.impactlow;
        this.impactmoderate = value.impactmoderate;
        this.impacthigh = value.impacthigh;
        this.description = value.description;
    }

    public Baselines(
        Integer id,
        Boolean impactlow,
        Boolean impactmoderate,
        Boolean impacthigh,
        String  description
    ) {
        this.id = id;
        this.impactlow = impactlow;
        this.impactmoderate = impactmoderate;
        this.impacthigh = impacthigh;
        this.description = description;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getImpactlow() {
        return this.impactlow;
    }

    public void setImpactlow(Boolean impactlow) {
        this.impactlow = impactlow;
    }

    public Boolean getImpactmoderate() {
        return this.impactmoderate;
    }

    public void setImpactmoderate(Boolean impactmoderate) {
        this.impactmoderate = impactmoderate;
    }

    public Boolean getImpacthigh() {
        return this.impacthigh;
    }

    public void setImpacthigh(Boolean impacthigh) {
        this.impacthigh = impacthigh;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Baselines (");

        sb.append(id);
        sb.append(", ").append(impactlow);
        sb.append(", ").append(impactmoderate);
        sb.append(", ").append(impacthigh);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}