package com.junling.mis.model.primary;

import java.math.BigDecimal;
import java.util.Date;

public class thirdPartyPaymentEntity extends thirdPartyPaymentEntityKey {
    private String claimBillNo;

    private BigDecimal thirdPartyPaymentAmount;

    private String thirdPartyPaymentType;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getClaimBillNo() {
        return claimBillNo;
    }

    public void setClaimBillNo(String claimBillNo) {
        this.claimBillNo = claimBillNo == null ? null : claimBillNo.trim();
    }

    public BigDecimal getThirdPartyPaymentAmount() {
        return thirdPartyPaymentAmount;
    }

    public void setThirdPartyPaymentAmount(BigDecimal thirdPartyPaymentAmount) {
        this.thirdPartyPaymentAmount = thirdPartyPaymentAmount;
    }

    public String getThirdPartyPaymentType() {
        return thirdPartyPaymentType;
    }

    public void setThirdPartyPaymentType(String thirdPartyPaymentType) {
        this.thirdPartyPaymentType = thirdPartyPaymentType == null ? null : thirdPartyPaymentType.trim();
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