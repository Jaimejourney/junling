package com.junling.mis.model.primary;

public class PolicyShareCoverageKey {
    private String policyShareCoverageId;

    private String policyShareCoverageNo;

    public String getPolicyShareCoverageId() {
        return policyShareCoverageId;
    }

    public void setPolicyShareCoverageId(String policyShareCoverageId) {
        this.policyShareCoverageId = policyShareCoverageId == null ? null : policyShareCoverageId.trim();
    }

    public String getPolicyShareCoverageNo() {
        return policyShareCoverageNo;
    }

    public void setPolicyShareCoverageNo(String policyShareCoverageNo) {
        this.policyShareCoverageNo = policyShareCoverageNo == null ? null : policyShareCoverageNo.trim();
    }
}