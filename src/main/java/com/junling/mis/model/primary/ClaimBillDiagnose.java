package com.junling.mis.model.primary;

import java.util.Date;

public class ClaimBillDiagnose extends ClaimBillDiagnoseKey {
    private String claimInfoId;

    private String claimNo;

    private String reportNo;

    private String claimBillNo;

    private String diagnosticCode;

    private String docTypeParent;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

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

    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo == null ? null : reportNo.trim();
    }

    public String getClaimBillNo() {
        return claimBillNo;
    }

    public void setClaimBillNo(String claimBillNo) {
        this.claimBillNo = claimBillNo == null ? null : claimBillNo.trim();
    }

    public String getDiagnosticCode() {
        return diagnosticCode;
    }

    public void setDiagnosticCode(String diagnosticCode) {
        this.diagnosticCode = diagnosticCode == null ? null : diagnosticCode.trim();
    }

    public String getDocTypeParent() {
        return docTypeParent;
    }

    public void setDocTypeParent(String docTypeParent) {
        this.docTypeParent = docTypeParent == null ? null : docTypeParent.trim();
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