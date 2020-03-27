package com.junling.mis.model.primary;

import java.math.BigDecimal;
import java.util.Date;

public class policyHealthNoteEntity {
    private String healthNoteId;

    private String policyNo;

    private String policyReinsuranceNo;

    private BigDecimal brNo;

    private String insureId;

    private String healthNoteCode;

    private String healthNoteResult;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getHealthNoteId() {
        return healthNoteId;
    }

    public void setHealthNoteId(String healthNoteId) {
        this.healthNoteId = healthNoteId == null ? null : healthNoteId.trim();
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

    public String getHealthNoteCode() {
        return healthNoteCode;
    }

    public void setHealthNoteCode(String healthNoteCode) {
        this.healthNoteCode = healthNoteCode == null ? null : healthNoteCode.trim();
    }

    public String getHealthNoteResult() {
        return healthNoteResult;
    }

    public void setHealthNoteResult(String healthNoteResult) {
        this.healthNoteResult = healthNoteResult == null ? null : healthNoteResult.trim();
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