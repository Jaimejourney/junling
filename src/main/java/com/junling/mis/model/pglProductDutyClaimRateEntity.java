package com.junling.mis.model;

import java.math.BigDecimal;
import java.util.Date;

public class pglProductDutyClaimRateEntity {
    private String pglpdClaimRateId;

    private String policyNo;

    private BigDecimal policyGradeLevelNo;

    private String productId;

    private String dutyId;

    private BigDecimal pglpdStartClaimAmount;

    private BigDecimal pglpdNextClaimAmount;

    private BigDecimal pglpdCalimRate;

    private BigDecimal pglpdSpecialHosRate;

    private BigDecimal pglpdMedicalUnused;

    private BigDecimal pglpdExPaymentRate;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getPglpdClaimRateId() {
        return pglpdClaimRateId;
    }

    public void setPglpdClaimRateId(String pglpdClaimRateId) {
        this.pglpdClaimRateId = pglpdClaimRateId == null ? null : pglpdClaimRateId.trim();
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

    public BigDecimal getPglpdStartClaimAmount() {
        return pglpdStartClaimAmount;
    }

    public void setPglpdStartClaimAmount(BigDecimal pglpdStartClaimAmount) {
        this.pglpdStartClaimAmount = pglpdStartClaimAmount;
    }

    public BigDecimal getPglpdNextClaimAmount() {
        return pglpdNextClaimAmount;
    }

    public void setPglpdNextClaimAmount(BigDecimal pglpdNextClaimAmount) {
        this.pglpdNextClaimAmount = pglpdNextClaimAmount;
    }

    public BigDecimal getPglpdCalimRate() {
        return pglpdCalimRate;
    }

    public void setPglpdCalimRate(BigDecimal pglpdCalimRate) {
        this.pglpdCalimRate = pglpdCalimRate;
    }

    public BigDecimal getPglpdSpecialHosRate() {
        return pglpdSpecialHosRate;
    }

    public void setPglpdSpecialHosRate(BigDecimal pglpdSpecialHosRate) {
        this.pglpdSpecialHosRate = pglpdSpecialHosRate;
    }

    public BigDecimal getPglpdMedicalUnused() {
        return pglpdMedicalUnused;
    }

    public void setPglpdMedicalUnused(BigDecimal pglpdMedicalUnused) {
        this.pglpdMedicalUnused = pglpdMedicalUnused;
    }

    public BigDecimal getPglpdExPaymentRate() {
        return pglpdExPaymentRate;
    }

    public void setPglpdExPaymentRate(BigDecimal pglpdExPaymentRate) {
        this.pglpdExPaymentRate = pglpdExPaymentRate;
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