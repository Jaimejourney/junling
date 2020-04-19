package com.junling.mis.model.primary;

import java.util.Date;

public class PolicyInsured {
    private String policyInsuredId;

    private String policyNo;

    private String policyReinsuranceNo;

    private Integer brNo;

    private String productId;

    private Date underwritingTime;

    private Date payTime;

    private Date acceptInsuranceTime;

    private Date effectTime;

    private Date maturityTime;

    private String policyInsuredStatus;

    private String prMainPerson;

    private String raltionMainPerson;

    private Integer insureAge;

    private String insureId;

    private String hasSocialSecurity;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getPolicyInsuredId() {
        return policyInsuredId;
    }

    public void setPolicyInsuredId(String policyInsuredId) {
        this.policyInsuredId = policyInsuredId == null ? null : policyInsuredId.trim();
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo == null ? null : policyNo.trim();
    }

    public String getPolicyReinsuranceNo() {
        return policyReinsuranceNo;
    }

    public void setPolicyReinsuranceNo(String policyReinsuranceNo) {
        this.policyReinsuranceNo = policyReinsuranceNo == null ? null : policyReinsuranceNo.trim();
    }

    public Integer getBrNo() {
        return brNo;
    }

    public void setBrNo(Integer brNo) {
        this.brNo = brNo;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public Date getUnderwritingTime() {
        return underwritingTime;
    }

    public void setUnderwritingTime(Date underwritingTime) {
        this.underwritingTime = underwritingTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getAcceptInsuranceTime() {
        return acceptInsuranceTime;
    }

    public void setAcceptInsuranceTime(Date acceptInsuranceTime) {
        this.acceptInsuranceTime = acceptInsuranceTime;
    }

    public Date getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(Date effectTime) {
        this.effectTime = effectTime;
    }

    public Date getMaturityTime() {
        return maturityTime;
    }

    public void setMaturityTime(Date maturityTime) {
        this.maturityTime = maturityTime;
    }

    public String getPolicyInsuredStatus() {
        return policyInsuredStatus;
    }

    public void setPolicyInsuredStatus(String policyInsuredStatus) {
        this.policyInsuredStatus = policyInsuredStatus == null ? null : policyInsuredStatus.trim();
    }

    public String getPrMainPerson() {
        return prMainPerson;
    }

    public void setPrMainPerson(String prMainPerson) {
        this.prMainPerson = prMainPerson == null ? null : prMainPerson.trim();
    }

    public String getRaltionMainPerson() {
        return raltionMainPerson;
    }

    public void setRaltionMainPerson(String raltionMainPerson) {
        this.raltionMainPerson = raltionMainPerson == null ? null : raltionMainPerson.trim();
    }

    public Integer getInsureAge() {
        return insureAge;
    }

    public void setInsureAge(Integer insureAge) {
        this.insureAge = insureAge;
    }

    public String getInsureId() {
        return insureId;
    }

    public void setInsureId(String insureId) {
        this.insureId = insureId == null ? null : insureId.trim();
    }

    public String getHasSocialSecurity() {
        return hasSocialSecurity;
    }

    public void setHasSocialSecurity(String hasSocialSecurity) {
        this.hasSocialSecurity = hasSocialSecurity == null ? null : hasSocialSecurity.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}