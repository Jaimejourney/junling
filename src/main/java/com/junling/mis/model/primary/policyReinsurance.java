package com.junling.mis.model.primary;

import java.util.Date;

public class policyReinsurance {
    private String policyReinsuranceId;

    private String policyNo;

    private String policyReinsuranceNo;

    private Integer brNo;

    private String productId;

    private Date underwritingTime;

    private Date payTime;

    private Date acceptInsuranceTime;

    private Date effectTime;

    private Date maturityTime;

    private String policyReinsuranceStatus;

    private String prMainPerson;

    private Integer totalInsuredCount;

    private Integer effectInsuredCount;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private String pbSpecialContract;

    public String getPolicyReinsuranceId() {
        return policyReinsuranceId;
    }

    public void setPolicyReinsuranceId(String policyReinsuranceId) {
        this.policyReinsuranceId = policyReinsuranceId == null ? null : policyReinsuranceId.trim();
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

    public String getPolicyReinsuranceStatus() {
        return policyReinsuranceStatus;
    }

    public void setPolicyReinsuranceStatus(String policyReinsuranceStatus) {
        this.policyReinsuranceStatus = policyReinsuranceStatus == null ? null : policyReinsuranceStatus.trim();
    }

    public String getPrMainPerson() {
        return prMainPerson;
    }

    public void setPrMainPerson(String prMainPerson) {
        this.prMainPerson = prMainPerson == null ? null : prMainPerson.trim();
    }

    public Integer getTotalInsuredCount() {
        return totalInsuredCount;
    }

    public void setTotalInsuredCount(Integer totalInsuredCount) {
        this.totalInsuredCount = totalInsuredCount;
    }

    public Integer getEffectInsuredCount() {
        return effectInsuredCount;
    }

    public void setEffectInsuredCount(Integer effectInsuredCount) {
        this.effectInsuredCount = effectInsuredCount;
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

    public String getPbSpecialContract() {
        return pbSpecialContract;
    }

    public void setPbSpecialContract(String pbSpecialContract) {
        this.pbSpecialContract = pbSpecialContract == null ? null : pbSpecialContract.trim();
    }
}