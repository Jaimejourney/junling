package com.junling.mis.model.primary;

public class ClaimOtherCostKey {
    private String otherCostId;

    private String costType;

    private String claimInfoId;

    public String getOtherCostId() {
        return otherCostId;
    }

    public void setOtherCostId(String otherCostId) {
        this.otherCostId = otherCostId == null ? null : otherCostId.trim();
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType == null ? null : costType.trim();
    }

    public String getClaimInfoId() {
        return claimInfoId;
    }

    public void setClaimInfoId(String claimInfoId) {
        this.claimInfoId = claimInfoId == null ? null : claimInfoId.trim();
    }
}