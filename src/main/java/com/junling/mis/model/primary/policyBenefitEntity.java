package com.junling.mis.model.primary;

import java.math.BigDecimal;
import java.util.Date;

public class policyBenefitEntity {
    private String policyBenefitId;

    private String policyNo;

    private String policyReinsuranceNo;

    private BigDecimal brNo;

    private String insureId;

    private String gradeLevelId;

    private String productId;

    private String dutyId;

    private Date underwritingTime;

    private Date payTime;

    private Date acceptInsuranceTime;

    private Date effectTime;

    private Date maturityTime;

    private String policyBenefitStatus;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private String pbSpecialContract;

    public String getPolicyBenefitId() {
        return policyBenefitId;
    }

    public void setPolicyBenefitId(String policyBenefitId) {
        this.policyBenefitId = policyBenefitId == null ? null : policyBenefitId.trim();
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

    public BigDecimal getBrNo() {
        return brNo;
    }

    public void setBrNo(BigDecimal brNo) {
        this.brNo = brNo;
    }

    public String getInsureId() {
        return insureId;
    }

    public void setInsureId(String insureId) {
        this.insureId = insureId == null ? null : insureId.trim();
    }

    public String getGradeLevelId() {
        return gradeLevelId;
    }

    public void setGradeLevelId(String gradeLevelId) {
        this.gradeLevelId = gradeLevelId == null ? null : gradeLevelId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getDutyId() {
        return dutyId;
    }

    public void setDutyId(String dutyId) {
        this.dutyId = dutyId == null ? null : dutyId.trim();
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

    public String getPolicyBenefitStatus() {
        return policyBenefitStatus;
    }

    public void setPolicyBenefitStatus(String policyBenefitStatus) {
        this.policyBenefitStatus = policyBenefitStatus == null ? null : policyBenefitStatus.trim();
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