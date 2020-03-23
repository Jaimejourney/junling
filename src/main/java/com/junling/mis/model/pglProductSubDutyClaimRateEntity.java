package com.junling.mis.model;

import java.math.BigDecimal;
import java.util.Date;

public class pglProductSubDutyClaimRateEntity {
    private String pglpsdClaimRateId;

    private String policyNo;

    private BigDecimal policyGradeLevelNo;

    private String productId;

    private String dutyId;

    private String subDutyId;

    private BigDecimal pglpsdStartClaimAmount;

    private BigDecimal pglpsdNextClaimAmount;

    private BigDecimal pglpsdCalimRate;

    private BigDecimal pglpsdSpecialHosRate;

    private BigDecimal pglpsdMedicalUnused;

    private BigDecimal pglpsdExPaymentRate;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getPglpsdClaimRateId() {
        return pglpsdClaimRateId;
    }

    public void setPglpsdClaimRateId(String pglpsdClaimRateId) {
        this.pglpsdClaimRateId = pglpsdClaimRateId == null ? null : pglpsdClaimRateId.trim();
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo == null ? null : policyNo.trim();
    }

    public BigDecimal getPolicyGradeLevelNo() {
        return policyGradeLevelNo;
    }

    public void setPolicyGradeLevelNo(BigDecimal policyGradeLevelNo) {
        this.policyGradeLevelNo = policyGradeLevelNo;
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

    public String getSubDutyId() {
        return subDutyId;
    }

    public void setSubDutyId(String subDutyId) {
        this.subDutyId = subDutyId == null ? null : subDutyId.trim();
    }

    public BigDecimal getPglpsdStartClaimAmount() {
        return pglpsdStartClaimAmount;
    }

    public void setPglpsdStartClaimAmount(BigDecimal pglpsdStartClaimAmount) {
        this.pglpsdStartClaimAmount = pglpsdStartClaimAmount;
    }

    public BigDecimal getPglpsdNextClaimAmount() {
        return pglpsdNextClaimAmount;
    }

    public void setPglpsdNextClaimAmount(BigDecimal pglpsdNextClaimAmount) {
        this.pglpsdNextClaimAmount = pglpsdNextClaimAmount;
    }

    public BigDecimal getPglpsdCalimRate() {
        return pglpsdCalimRate;
    }

    public void setPglpsdCalimRate(BigDecimal pglpsdCalimRate) {
        this.pglpsdCalimRate = pglpsdCalimRate;
    }

    public BigDecimal getPglpsdSpecialHosRate() {
        return pglpsdSpecialHosRate;
    }

    public void setPglpsdSpecialHosRate(BigDecimal pglpsdSpecialHosRate) {
        this.pglpsdSpecialHosRate = pglpsdSpecialHosRate;
    }

    public BigDecimal getPglpsdMedicalUnused() {
        return pglpsdMedicalUnused;
    }

    public void setPglpsdMedicalUnused(BigDecimal pglpsdMedicalUnused) {
        this.pglpsdMedicalUnused = pglpsdMedicalUnused;
    }

    public BigDecimal getPglpsdExPaymentRate() {
        return pglpsdExPaymentRate;
    }

    public void setPglpsdExPaymentRate(BigDecimal pglpsdExPaymentRate) {
        this.pglpsdExPaymentRate = pglpsdExPaymentRate;
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