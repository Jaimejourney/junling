package com.junling.mis.model.primary;

public class claimBillDiagnoseKey {
    private String claimBillDiagnoseId;

    private String claimBillId;

    public String getClaimBillDiagnoseId() {
        return claimBillDiagnoseId;
    }

    public void setClaimBillDiagnoseId(String claimBillDiagnoseId) {
        this.claimBillDiagnoseId = claimBillDiagnoseId == null ? null : claimBillDiagnoseId.trim();
    }

    public String getClaimBillId() {
        return claimBillId;
    }

    public void setClaimBillId(String claimBillId) {
        this.claimBillId = claimBillId == null ? null : claimBillId.trim();
    }
}