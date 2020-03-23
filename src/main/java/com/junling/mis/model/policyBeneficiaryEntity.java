package com.junling.mis.model;

import java.math.BigDecimal;
import java.util.Date;

public class policyBeneficiaryEntity {
    private String policyBeneficiaryId;

    private String policyNo;

    private String policyReinsuranceNo;

    private BigDecimal brNo;

    private String insureId;

    private String gradeLevelId;

    private String productId;

    private String dutyId;

    private String policyBeneficiaryType;

    private String policyBeneficiaryOrder;

    private BigDecimal policyBeneficiaryRate;

    private String insureRelation;

    private String customerId;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getPolicyBeneficiaryId() {
        return policyBeneficiaryId;
    }

    public void setPolicyBeneficiaryId(String policyBeneficiaryId) {
        this.policyBeneficiaryId = policyBeneficiaryId == null ? null : policyBeneficiaryId.trim();
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

    public String getPolicyBeneficiaryType() {
        return policyBeneficiaryType;
    }

    public void setPolicyBeneficiaryType(String policyBeneficiaryType) {
        this.policyBeneficiaryType = policyBeneficiaryType == null ? null : policyBeneficiaryType.trim();
    }

    public String getPolicyBeneficiaryOrder() {
        return policyBeneficiaryOrder;
    }

    public void setPolicyBeneficiaryOrder(String policyBeneficiaryOrder) {
        this.policyBeneficiaryOrder = policyBeneficiaryOrder == null ? null : policyBeneficiaryOrder.trim();
    }

    public BigDecimal getPolicyBeneficiaryRate() {
        return policyBeneficiaryRate;
    }

    public void setPolicyBeneficiaryRate(BigDecimal policyBeneficiaryRate) {
        this.policyBeneficiaryRate = policyBeneficiaryRate;
    }

    public String getInsureRelation() {
        return insureRelation;
    }

    public void setInsureRelation(String insureRelation) {
        this.insureRelation = insureRelation == null ? null : insureRelation.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
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