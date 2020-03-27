package com.junling.mis.model.primary;

import java.math.BigDecimal;
import java.util.Date;

public class paymentItemRelationEntity {
    private String paymentItemCode;

    private String paymentItemName;

    private String paymentItemEnglishName;

    private String paymentItemNickName;

    private String paymentItemNickEnglishName;

    private String paymentItemCategory;

    private String districtCode;

    private BigDecimal paymentClaimRate;

    private String formulation;

    private String specification;

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

    public String getPaymentItemNickName() {
        return paymentItemNickName;
    }

    public void setPaymentItemNickName(String paymentItemNickName) {
        this.paymentItemNickName = paymentItemNickName == null ? null : paymentItemNickName.trim();
    }

    public String getPaymentItemNickEnglishName() {
        return paymentItemNickEnglishName;
    }

    public void setPaymentItemNickEnglishName(String paymentItemNickEnglishName) {
        this.paymentItemNickEnglishName = paymentItemNickEnglishName == null ? null : paymentItemNickEnglishName.trim();
    }

    public String getPaymentItemCategory() {
        return paymentItemCategory;
    }

    public void setPaymentItemCategory(String paymentItemCategory) {
        this.paymentItemCategory = paymentItemCategory == null ? null : paymentItemCategory.trim();
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode == null ? null : districtCode.trim();
    }

    public BigDecimal getPaymentClaimRate() {
        return paymentClaimRate;
    }

    public void setPaymentClaimRate(BigDecimal paymentClaimRate) {
        this.paymentClaimRate = paymentClaimRate;
    }

    public String getFormulation() {
        return formulation;
    }

    public void setFormulation(String formulation) {
        this.formulation = formulation == null ? null : formulation.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
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