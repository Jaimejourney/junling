package com.junling.mis.model;

public class claimBillDetailEntityKey {
    private String claimBillDetailId;

    private String paymentItemCode;

    public String getClaimBillDetailId() {
        return claimBillDetailId;
    }

    public void setClaimBillDetailId(String claimBillDetailId) {
        this.claimBillDetailId = claimBillDetailId == null ? null : claimBillDetailId.trim();
    }

    public String getPaymentItemCode() {
        return paymentItemCode;
    }

    public void setPaymentItemCode(String paymentItemCode) {
        this.paymentItemCode = paymentItemCode == null ? null : paymentItemCode.trim();
    }
}