package com.junling.mis.model.primary;

public class ClaimAccountInfoKey {
    private String accountId;

    private String claimInfoId;

    private String accountName;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getClaimInfoId() {
        return claimInfoId;
    }

    public void setClaimInfoId(String claimInfoId) {
        this.claimInfoId = claimInfoId == null ? null : claimInfoId.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }
}