package com.junling.mis.model.primary;

import java.util.Date;

public class pglpdClaimRate {
    private String pglpdClaimRateId;

    private String policyNo;

    private Integer policyGradeLevelNo;

    private String productId;

    private String dutyId;

    private Integer pglpdStartClaimAmount;

    private Integer pglpdNextClaimAmount;

    private Integer pglpdCalimRate;

    private Integer pglpdSpecialHosRate;

    private Integer pglpdMedicalUnused;

    private Integer pglpdExPaymentRate;

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

    public Integer getPolicyGradeLevelNo() {
        return policyGradeLevelNo;
    }

    public void setPolicyGradeLevelNo(Integer policyGradeLevelNo) {
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

    public Integer getPglpdStartClaimAmount() {
        return pglpdStartClaimAmount;
    }

    public void setPglpdStartClaimAmount(Integer pglpdStartClaimAmount) {
        this.pglpdStartClaimAmount = pglpdStartClaimAmount;
    }

    public Integer getPglpdNextClaimAmount() {
        return pglpdNextClaimAmount;
    }

    public void setPglpdNextClaimAmount(Integer pglpdNextClaimAmount) {
        this.pglpdNextClaimAmount = pglpdNextClaimAmount;
    }

    public Integer getPglpdCalimRate() {
        return pglpdCalimRate;
    }

    public void setPglpdCalimRate(Integer pglpdCalimRate) {
        this.pglpdCalimRate = pglpdCalimRate;
    }

    public Integer getPglpdSpecialHosRate() {
        return pglpdSpecialHosRate;
    }

    public void setPglpdSpecialHosRate(Integer pglpdSpecialHosRate) {
        this.pglpdSpecialHosRate = pglpdSpecialHosRate;
    }

    public Integer getPglpdMedicalUnused() {
        return pglpdMedicalUnused;
    }

    public void setPglpdMedicalUnused(Integer pglpdMedicalUnused) {
        this.pglpdMedicalUnused = pglpdMedicalUnused;
    }

    public Integer getPglpdExPaymentRate() {
        return pglpdExPaymentRate;
    }

    public void setPglpdExPaymentRate(Integer pglpdExPaymentRate) {
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