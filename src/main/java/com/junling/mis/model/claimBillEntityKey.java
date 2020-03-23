package com.junling.mis.model;

public class claimBillEntityKey {
    private String claimBillId;

    private String claimInfoId;

    public String getClaimBillId() {
        return claimBillId;
    }

    public void setClaimBillId(String claimBillId) {
        this.claimBillId = claimBillId == null ? null : claimBillId.trim();
    }

    public String getClaimInfoId() {
        return claimInfoId;
    }

    public void setClaimInfoId(String claimInfoId) {
        this.claimInfoId = claimInfoId == null ? null : claimInfoId.trim();
    }
}