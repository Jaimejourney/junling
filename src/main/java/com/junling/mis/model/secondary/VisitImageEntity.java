package com.junling.mis.model.secondary;

import java.math.BigDecimal;
import java.util.Date;

public class VisitImageEntity {
    private BigDecimal id;

    private Date createTime;

    private String updatePoson;

    private Date updateTime;

    private Long isDelete;

    private String applyRecord;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdatePoson() {
        return updatePoson;
    }

    public void setUpdatePoson(String updatePoson) {
        this.updatePoson = updatePoson == null ? null : updatePoson.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
    }

    public String getApplyRecord() {
        return applyRecord;
    }

    public void setApplyRecord(String applyRecord) {
        this.applyRecord = applyRecord == null ? null : applyRecord.trim();
    }
}