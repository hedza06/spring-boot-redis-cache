package com.springboot.redis.domains;

import org.springframework.context.annotation.Description;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Description(value = "Insurance Entity class representation.")
@Entity
@Table(name = "insurance")
public class Insurance implements Serializable {

    private static final long serialVersionUID = 1344564576767978L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private Long policyID;

    @NotNull
    @Column(name = "statecode", nullable = false)
    private String stateCode;

    @NotNull
    @Column(name = "county", nullable = false)
    private String county;

    @NotNull
    @Column(name = "eq_site_limit", nullable = false)
    private Double eqSiteLimit;

    @NotNull
    @Column(name = "hu_site_limit", nullable = false)
    private Double huSiteLimit;

    @NotNull
    @Column(name = "fl_site_limit", nullable = false)
    private Double flSiteLimit;

    @NotNull
    @Column(name = "fr_site_limit", nullable = false)
    private Double frSiteLimit;

    @NotNull
    @Column(name = "tiv_2011", nullable = false)
    private Double tiv2011;

    @NotNull
    @Column(name = "tiv_2012", nullable = false)
    private Double tiv2012;

    @NotNull
    @Column(name = "eq_site_deductible", nullable = false)
    private Double eqSiteDeductible;

    @NotNull
    @Column(name = "hu_site_deductible", nullable = false)
    private Double huSiteDeductible;

    @NotNull
    @Column(name = "fl_site_deductible", nullable = false)
    private Double flSiteDeductible;

    @NotNull
    @Column(name = "fr_site_deductible", nullable = false)
    private Double frSiteDeductible;

    @NotNull
    @Column(name = "point_latitude", nullable = false)
    private Double pointLatitude;

    @NotNull
    @Column(name = "point_longitude", nullable = false)
    private Double pointLongitude;

    @NotNull
    @Column(name = "line", nullable = false)
    private String line;

    @NotNull
    @Column(nullable = false)
    private String construction;

    @NotNull
    @Column(name = "point_granularity", nullable = false)
    private Integer pointGranularity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getPolicyID() {
        return policyID;
    }

    public void setPolicyID(Long policyID) {
        this.policyID = policyID;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public Double getEqSiteLimit() {
        return eqSiteLimit;
    }

    public void setEqSiteLimit(Double eqSiteLimit) {
        this.eqSiteLimit = eqSiteLimit;
    }

    public Double getHuSiteLimit() {
        return huSiteLimit;
    }

    public void setHuSiteLimit(Double huSiteLimit) {
        this.huSiteLimit = huSiteLimit;
    }

    public Double getFlSiteLimit() {
        return flSiteLimit;
    }

    public void setFlSiteLimit(Double flSiteLimit) {
        this.flSiteLimit = flSiteLimit;
    }

    public Double getFrSiteLimit() {
        return frSiteLimit;
    }

    public void setFrSiteLimit(Double frSiteLimit) {
        this.frSiteLimit = frSiteLimit;
    }

    public Double getTiv2011() {
        return tiv2011;
    }

    public void setTiv2011(Double tiv2011) {
        this.tiv2011 = tiv2011;
    }

    public Double getTiv2012() {
        return tiv2012;
    }

    public void setTiv2012(Double tiv2012) {
        this.tiv2012 = tiv2012;
    }

    public Double getEqSiteDeductible() {
        return eqSiteDeductible;
    }

    public void setEqSiteDeductible(Double eqSiteDeductible) {
        this.eqSiteDeductible = eqSiteDeductible;
    }

    public Double getHuSiteDeductible() {
        return huSiteDeductible;
    }

    public void setHuSiteDeductible(Double huSiteDeductible) {
        this.huSiteDeductible = huSiteDeductible;
    }

    public Double getFlSiteDeductible() {
        return flSiteDeductible;
    }

    public void setFlSiteDeductible(Double flSiteDeductible) {
        this.flSiteDeductible = flSiteDeductible;
    }

    public Double getFrSiteDeductible() {
        return frSiteDeductible;
    }

    public void setFrSiteDeductible(Double frSiteDeductible) {
        this.frSiteDeductible = frSiteDeductible;
    }

    public Double getPointLatitude() {
        return pointLatitude;
    }

    public void setPointLatitude(Double pointLatitude) {
        this.pointLatitude = pointLatitude;
    }

    public Double getPointLongitude() {
        return pointLongitude;
    }

    public void setPointLongitude(Double pointLongitude) {
        this.pointLongitude = pointLongitude;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public Integer getPointGranularity() {
        return pointGranularity;
    }

    public void setPointGranularity(Integer pointGranularity) {
        this.pointGranularity = pointGranularity;
    }

    @Override
    public String toString()
    {
        return "Insurance{" +
                "id=" + id +
                ", policyID=" + policyID +
                ", stateCode='" + stateCode + '\'' +
                ", county='" + county + '\'' +
                ", eqSiteLimit=" + eqSiteLimit +
                ", huSiteLimit=" + huSiteLimit +
                ", flSiteLimit=" + flSiteLimit +
                ", frSiteLimit=" + frSiteLimit +
                ", tiv2011=" + tiv2011 +
                ", tiv2012=" + tiv2012 +
                ", eqSiteDeductible=" + eqSiteDeductible +
                ", huSiteDeductible=" + huSiteDeductible +
                ", flSiteDeductible=" + flSiteDeductible +
                ", frSiteDeductible=" + frSiteDeductible +
                ", pointLatitude=" + pointLatitude +
                ", pointLongitude=" + pointLongitude +
                ", line='" + line + '\'' +
                ", construction='" + construction + '\'' +
                ", pointGranularity=" + pointGranularity +
                '}';
    }

    @Override
    public boolean equals(Object target)
    {
        if (this == target) {
            return true;
        }

        if (target == null || getClass() != target.getClass()) {
            return false;
        }

        Insurance insurance = (Insurance) target;
        return Objects.equals(id, insurance.id) &&
                Objects.equals(policyID, insurance.policyID) &&
                Objects.equals(stateCode, insurance.stateCode) &&
                Objects.equals(county, insurance.county) &&
                Objects.equals(eqSiteLimit, insurance.eqSiteLimit) &&
                Objects.equals(huSiteLimit, insurance.huSiteLimit) &&
                Objects.equals(flSiteLimit, insurance.flSiteLimit) &&
                Objects.equals(frSiteLimit, insurance.frSiteLimit) &&
                Objects.equals(tiv2011, insurance.tiv2011) &&
                Objects.equals(tiv2012, insurance.tiv2012) &&
                Objects.equals(eqSiteDeductible, insurance.eqSiteDeductible) &&
                Objects.equals(huSiteDeductible, insurance.huSiteDeductible) &&
                Objects.equals(flSiteDeductible, insurance.flSiteDeductible) &&
                Objects.equals(frSiteDeductible, insurance.frSiteDeductible) &&
                Objects.equals(pointLatitude, insurance.pointLatitude) &&
                Objects.equals(pointLongitude, insurance.pointLongitude) &&
                Objects.equals(line, insurance.line) &&
                Objects.equals(construction, insurance.construction) &&
                Objects.equals(pointGranularity, insurance.pointGranularity);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, policyID, stateCode, county, eqSiteLimit, huSiteLimit, flSiteLimit, frSiteLimit,
                tiv2011, tiv2012, eqSiteDeductible, huSiteDeductible, flSiteDeductible, frSiteDeductible, pointLatitude,
                pointLongitude, line, construction, pointGranularity
        );
    }
}
