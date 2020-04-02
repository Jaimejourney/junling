package com.junling.mis.model.primary;

import java.util.Date;

public class tbImageType {
    private String docTypeCode;

    private String docTypeName;

    private String docTypeParent;

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

    public String getDocTypeName() {
        return docTypeName;
    }

    public void setDocTypeName(String docTypeName) {
        this.docTypeName = docTypeName == null ? null : docTypeName.trim();
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