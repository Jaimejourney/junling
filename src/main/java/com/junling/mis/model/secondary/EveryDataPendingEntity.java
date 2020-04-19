package com.junling.mis.model.secondary;

import java.util.Date;

public class EveryDataPendingEntity {
    private Integer id;

    private String dates;

    private String auditpending;

    private String approvepending;

    private String qualitypending;

    private String settlepending;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates == null ? null : dates.trim();
    }

    public String getAuditpending() {
        return auditpending;
    }

    public void setAuditpending(String auditpending) {
        this.auditpending = auditpending == null ? null : auditpending.trim();
    }

    public String getApprovepending() {
        return approvepending;
    }

    public void setApprovepending(String approvepending) {
        this.approvepending = approvepending == null ? null : approvepending.trim();
    }

    public String getQualitypending() {
        return qualitypending;
    }

    public void setQualitypending(String qualitypending) {
        this.qualitypending = qualitypending == null ? null : qualitypending.trim();
    }

    public String getSettlepending() {
        return settlepending;
    }

    public void setSettlepending(String settlepending) {
        this.settlepending = settlepending == null ? null : settlepending.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}