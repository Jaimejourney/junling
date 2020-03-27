package com.junling.mis.model.primary;

import java.math.BigDecimal;
import java.util.Date;

public class policyInfoEntity {
    private String policyInfoId;

    private String policyNo;

    private String productId;

    private Date underwritingTime;

    private Date payTime;

    private Date acceptInsuranceTime;

    private Date effectTime;

    private Date maturityTime;

    private String policyStatus;

    private String policyHolder;

    private String policyType;

    private String contactPerson;

    private String contactAddress;

    private String contactPhoneNo;

    private String contactEmail;

    private BigDecimal totalPrem;

    private BigDecimal totalInsuredCount;

    private BigDecimal effectInsuredCount;

    private String policyOrganization;

    private String isRenew;

    private String renewPolicyNo;

    private String policyPayType;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private String policySpecialContract;

    public String getPolicyInfoId() {
        return policyInfoId;
    }

    public void setPolicyInfoId(String policyInfoId) {
        this.policyInfoId = policyInfoId == null ? null : policyInfoId.trim();
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo == null ? null : policyNo.trim();
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

    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus == null ? null : policyStatus.trim();
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(String policyHolder) {
        this.policyHolder = policyHolder == null ? null : policyHolder.trim();
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType == null ? null : policyType.trim();
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson == null ? null : contactPerson.trim();
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    public String getContactPhoneNo() {
        return contactPhoneNo;
    }

    public void setContactPhoneNo(String contactPhoneNo) {
        this.contactPhoneNo = contactPhoneNo == null ? null : contactPhoneNo.trim();
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    public BigDecimal getTotalPrem() {
        return totalPrem;
    }

    public void setTotalPrem(BigDecimal totalPrem) {
        this.totalPrem = totalPrem;
    }

    public BigDecimal getTotalInsuredCount() {
        return totalInsuredCount;
    }

    public void setTotalInsuredCount(BigDecimal totalInsuredCount) {
        this.totalInsuredCount = totalInsuredCount;
    }

    public BigDecimal getEffectInsuredCount() {
        return effectInsuredCount;
    }

    public void setEffectInsuredCount(BigDecimal effectInsuredCount) {
        this.effectInsuredCount = effectInsuredCount;
    }

    public String getPolicyOrganization() {
        return policyOrganization;
    }

    public void setPolicyOrganization(String policyOrganization) {
        this.policyOrganization = policyOrganization == null ? null : policyOrganization.trim();
    }

    public String getIsRenew() {
        return isRenew;
    }

    public void setIsRenew(String isRenew) {
        this.isRenew = isRenew == null ? null : isRenew.trim();
    }

    public String getRenewPolicyNo() {
        return renewPolicyNo;
    }

    public void setRenewPolicyNo(String renewPolicyNo) {
        this.renewPolicyNo = renewPolicyNo == null ? null : renewPolicyNo.trim();
    }

    public String getPolicyPayType() {
        return policyPayType;
    }

    public void setPolicyPayType(String policyPayType) {
        this.policyPayType = policyPayType == null ? null : policyPayType.trim();
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

    public String getPolicySpecialContract() {
        return policySpecialContract;
    }

    public void setPolicySpecialContract(String policySpecialContract) {
        this.policySpecialContract = policySpecialContract == null ? null : policySpecialContract.trim();
    }
}