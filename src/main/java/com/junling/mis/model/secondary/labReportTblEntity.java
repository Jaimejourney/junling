package com.junling.mis.model.secondary;

import java.util.Date;

public class labReportTblEntity {
    private String labflow;

    private String recordflow;

    private String pid;

    private String labrepname;

    private Date labapplytime;

    private String labappliercode;

    private String labappliername;

    private String applierdeptcode;

    private String applierdept;

    private String sample;

    private Date labtime;

    private String labrecorderid;

    private String labrecorder;

    private String audituserid;

    private String auditusername;

    private String labinstrument;

    private String bedno;

    private String isbacilli;

    private String remark;

    private String inoutflag;

    private String updatePoson;

    private Date updateTime;

    private Long isDelete;

    public String getLabflow() {
        return labflow;
    }

    public void setLabflow(String labflow) {
        this.labflow = labflow == null ? null : labflow.trim();
    }

    public String getRecordflow() {
        return recordflow;
    }

    public void setRecordflow(String recordflow) {
        this.recordflow = recordflow == null ? null : recordflow.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getLabrepname() {
        return labrepname;
    }

    public void setLabrepname(String labrepname) {
        this.labrepname = labrepname == null ? null : labrepname.trim();
    }

    public Date getLabapplytime() {
        return labapplytime;
    }

    public void setLabapplytime(Date labapplytime) {
        this.labapplytime = labapplytime;
    }

    public String getLabappliercode() {
        return labappliercode;
    }

    public void setLabappliercode(String labappliercode) {
        this.labappliercode = labappliercode == null ? null : labappliercode.trim();
    }

    public String getLabappliername() {
        return labappliername;
    }

    public void setLabappliername(String labappliername) {
        this.labappliername = labappliername == null ? null : labappliername.trim();
    }

    public String getApplierdeptcode() {
        return applierdeptcode;
    }

    public void setApplierdeptcode(String applierdeptcode) {
        this.applierdeptcode = applierdeptcode == null ? null : applierdeptcode.trim();
    }

    public String getApplierdept() {
        return applierdept;
    }

    public void setApplierdept(String applierdept) {
        this.applierdept = applierdept == null ? null : applierdept.trim();
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample == null ? null : sample.trim();
    }

    public Date getLabtime() {
        return labtime;
    }

    public void setLabtime(Date labtime) {
        this.labtime = labtime;
    }

    public String getLabrecorderid() {
        return labrecorderid;
    }

    public void setLabrecorderid(String labrecorderid) {
        this.labrecorderid = labrecorderid == null ? null : labrecorderid.trim();
    }

    public String getLabrecorder() {
        return labrecorder;
    }

    public void setLabrecorder(String labrecorder) {
        this.labrecorder = labrecorder == null ? null : labrecorder.trim();
    }

    public String getAudituserid() {
        return audituserid;
    }

    public void setAudituserid(String audituserid) {
        this.audituserid = audituserid == null ? null : audituserid.trim();
    }

    public String getAuditusername() {
        return auditusername;
    }

    public void setAuditusername(String auditusername) {
        this.auditusername = auditusername == null ? null : auditusername.trim();
    }

    public String getLabinstrument() {
        return labinstrument;
    }

    public void setLabinstrument(String labinstrument) {
        this.labinstrument = labinstrument == null ? null : labinstrument.trim();
    }

    public String getBedno() {
        return bedno;
    }

    public void setBedno(String bedno) {
        this.bedno = bedno == null ? null : bedno.trim();
    }

    public String getIsbacilli() {
        return isbacilli;
    }

    public void setIsbacilli(String isbacilli) {
        this.isbacilli = isbacilli == null ? null : isbacilli.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getInoutflag() {
        return inoutflag;
    }

    public void setInoutflag(String inoutflag) {
        this.inoutflag = inoutflag == null ? null : inoutflag.trim();
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