package com.junling.mis.model.primary;

public class claimDocKey {
    private String claimInfoId;

    private String claimNo;

    public String getClaimInfoId() {
        return claimInfoId;
    }

    public void setClaimInfoId(String claimInfoId) {
        this.claimInfoId = claimInfoId == null ? null : claimInfoId.trim();
    }

    public String getClaimNo() {
        return claimNo;
    }

    public void setClaimNo(String claimNo) {
        this.claimNo = claimNo == null ? null : claimNo.trim();
    }
}