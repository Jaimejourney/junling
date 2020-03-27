package com.junling.mis.model.primary;

public class thirdPartyPaymentEntityKey {
    private String thirdPartyPaymentId;

    private String claimInfoId;

    public String getThirdPartyPaymentId() {
        return thirdPartyPaymentId;
    }

    public void setThirdPartyPaymentId(String thirdPartyPaymentId) {
        this.thirdPartyPaymentId = thirdPartyPaymentId == null ? null : thirdPartyPaymentId.trim();
    }

    public String getClaimInfoId() {
        return claimInfoId;
    }

    public void setClaimInfoId(String claimInfoId) {
        this.claimInfoId = claimInfoId == null ? null : claimInfoId.trim();
    }
}