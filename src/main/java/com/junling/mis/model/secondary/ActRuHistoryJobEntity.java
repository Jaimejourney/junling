package com.junling.mis.model.secondary;

import java.util.Date;

public class ActRuHistoryJobEntity {
    private String id;

    private Integer rev;

    private Date lockExpTime;

    private String lockOwner;

    private Integer retries;

    private String exceptionStackId;

    private String exceptionMsg;

    private String handlerType;

    private String handlerCfg;

    private String advHandlerCfgId;

    private Date createTime;

    private String tenantId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getRev() {
        return rev;
    }

    public void setRev(Integer rev) {
        this.rev = rev;
    }

    public Date getLockExpTime() {
        return lockExpTime;
    }

    public void setLockExpTime(Date lockExpTime) {
        this.lockExpTime = lockExpTime;
    }

    public String getLockOwner() {
        return lockOwner;
    }

    public void setLockOwner(String lockOwner) {
        this.lockOwner = lockOwner == null ? null : lockOwner.trim();
    }

    public Integer getRetries() {
        return retries;
    }

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public String getExceptionStackId() {
        return exceptionStackId;
    }

    public void setExceptionStackId(String exceptionStackId) {
        this.exceptionStackId = exceptionStackId == null ? null : exceptionStackId.trim();
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg == null ? null : exceptionMsg.trim();
    }

    public String getHandlerType() {
        return handlerType;
    }

    public void setHandlerType(String handlerType) {
        this.handlerType = handlerType == null ? null : handlerType.trim();
    }

    public String getHandlerCfg() {
        return handlerCfg;
    }

    public void setHandlerCfg(String handlerCfg) {
        this.handlerCfg = handlerCfg == null ? null : handlerCfg.trim();
    }

    public String getAdvHandlerCfgId() {
        return advHandlerCfgId;
    }

    public void setAdvHandlerCfgId(String advHandlerCfgId) {
        this.advHandlerCfgId = advHandlerCfgId == null ? null : advHandlerCfgId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }
}