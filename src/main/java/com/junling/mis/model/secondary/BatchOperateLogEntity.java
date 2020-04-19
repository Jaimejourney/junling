package com.junling.mis.model.secondary;

import java.util.Date;

public class BatchOperateLogEntity {
    private String id;

    private Date operateTime;

    private String polno;

    private Byte batchType;

    private String batchFileName;

    private String result;

    private Byte resultStatus;

    private String updatePoson;

    private Date updateTime;

    private Long isDelete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getPolno() {
        return polno;
    }

    public void setPolno(String polno) {
        this.polno = polno == null ? null : polno.trim();
    }

    public Byte getBatchType() {
        return batchType;
    }

    public void setBatchType(Byte batchType) {
        this.batchType = batchType;
    }

    public String getBatchFileName() {
        return batchFileName;
    }

    public void setBatchFileName(String batchFileName) {
        this.batchFileName = batchFileName == null ? null : batchFileName.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public Byte getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(Byte resultStatus) {
        this.resultStatus = resultStatus;
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
}