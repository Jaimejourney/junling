package com.junling.mis.model.primary;

import java.math.BigDecimal;
import java.util.Date;

public class claimBillDetailEntity extends claimBillDetailEntityKey {
    private String claimBillId;

    private String claimBillNo;

    private String paymentItemName;

    private String paymentItemType;

    private BigDecimal paymentItemPrice;

    private String policyNo;

    private String policyReinsuranceNo;

    private BigDecimal brNo;

    private String insureId;

    private String gradeLevelId;

    private String productId;

    private String dutyId;

    private String subDutyId;

    private String claimItemOption;

    private String claimItemResult;

    private BigDecimal claimItemAmount;

    private BigDecimal claimItemRate;

    private String rejectCauseCode;

    private String rejectCause;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getClaimBillId() {
        return claimBillId;
    }

    public void setClaimBillId(String claimBillId) {
        this.claimBillId = claimBillId == null ? null : claimBillId.trim();
    }

    public String getClaimBillNo() {
        return claimBillNo;
    }

    public void setClaimBillNo(String claimBillNo) {
        this.claimBillNo = claimBillNo == null ? null : claimBillNo.trim();
    }

    public String getPaymentItemName() {
        return paymentItemName;
    }

    public void setPaymentItemName(String paymentItemName) {
        this.paymentItemName = paymentItemName == null ? null : paymentItemName.trim();
    }

    public String getPaymentItemType() {
        return paymentItemType;
    }

    public void setPaymentItemType(String paymentItemType) {
        this.paymentItemType = paymentItemType == null ? null : paymentItemType.trim();
    }

    public BigDecimal getPaymentItemPrice() {
        return paymentItemPrice;
    }

    public void setPaymentItemPrice(BigDecimal paymentItemPrice) {
        this.paymentItemPrice = paymentItemPrice;
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

    public String getSubDutyId() {
        return subDutyId;
    }

    public void setSubDutyId(String subDutyId) {
        this.subDutyId = subDutyId == null ? null : subDutyId.trim();
    }

    public String getClaimItemOption() {
        return claimItemOption;
    }

    public void setClaimItemOption(String claimItemOption) {
        this.claimItemOption = claimItemOption == null ? null : claimItemOption.trim();
    }

    public String getClaimItemResult() {
        return claimItemResult;
    }

    public void setClaimItemResult(String claimItemResult) {
        this.claimItemResult = claimItemResult == null ? null : claimItemResult.trim();
    }

    public BigDecimal getClaimItemAmount() {
        return claimItemAmount;
    }

    public void setClaimItemAmount(BigDecimal claimItemAmount) {
        this.claimItemAmount = claimItemAmount;
    }

    public BigDecimal getClaimItemRate() {
        return claimItemRate;
    }

    public void setClaimItemRate(BigDecimal claimItemRate) {
        this.claimItemRate = claimItemRate;
    }

    public String getRejectCauseCode() {
        return rejectCauseCode;
    }

    public void setRejectCauseCode(String rejectCauseCode) {
        this.rejectCauseCode = rejectCauseCode == null ? null : rejectCauseCode.trim();
    }

    public String getRejectCause() {
        return rejectCause;
    }

    public void setRejectCause(String rejectCause) {
        this.rejectCause = rejectCause == null ? null : rejectCause.trim();
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