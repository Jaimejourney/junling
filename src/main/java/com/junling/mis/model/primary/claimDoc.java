package com.junling.mis.model.primary;

import java.util.Date;

public class claimDoc extends claimDocKey {
    private String docTypeCode;

    private String docSubTypeCode;

    private String docUrl;

    private String docNo;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getDocTypeCode() {
        return docTypeCode;
    }

    public void setDocTypeCode(String docTypeCode) {
        this.docTypeCode = docTypeCode == null ? null : docTypeCode.trim();
    }

    public String getDocSubTypeCode() {
        return docSubTypeCode;
    }

    public void setDocSubTypeCode(String docSubTypeCode) {
        this.docSubTypeCode = docSubTypeCode == null ? null : docSubTypeCode.trim();
    }

    public String getDocUrl() {
        return docUrl;
    }

    public void setDocUrl(String docUrl) {
        this.docUrl = docUrl == null ? null : docUrl.trim();
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo == null ? null : docNo.trim();
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