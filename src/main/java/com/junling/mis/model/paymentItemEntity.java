package com.junling.mis.model;

import java.util.Date;

public class paymentItemEntity {
    private String paymentItemCode;

    private String paymentItemName;

    private String paymentItemEnglishName;

    private String paymentItemCategory;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getPaymentItemCode() {
        return paymentItemCode;
    }

    public void setPaymentItemCode(String paymentItemCode) {
        this.paymentItemCode = paymentItemCode == null ? null : paymentItemCode.trim();
    }

    public String getPaymentItemName() {
        return paymentItemName;
    }

    public void setPaymentItemName(String paymentItemName) {
        this.paymentItemName = paymentItemName == null ? null : paymentItemName.trim();
    }

    public String getPaymentItemEnglishName() {
        return paymentItemEnglishName;
    }

    public void setPaymentItemEnglishName(String paymentItemEnglishName) {
        this.paymentItemEnglishName = paymentItemEnglishName == null ? null : paymentItemEnglishName.trim();
    }

    public String getPaymentItemCategory() {
        return paymentItemCategory;
    }

    public void setPaymentItemCategory(String paymentItemCategory) {
        this.paymentItemCategory = paymentItemCategory == null ? null : paymentItemCategory.trim();
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