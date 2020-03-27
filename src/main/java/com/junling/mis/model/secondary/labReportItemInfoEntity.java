package com.junling.mis.model.secondary;

import java.util.Date;

public class labReportItemInfoEntity {
    private String labitemrcdflow;

    private String labflow;

    private String labrepitemcode;

    private String labrepitemname;

    private String resulttype;

    private String resultnum;

    private String resulttext;

    private String referencetext;

    private String labrepitemunit;

    private String changeflag;

    private String updatePoson;

    private Date updateTime;

    private Long isDelete;

    public String getLabitemrcdflow() {
        return labitemrcdflow;
    }

    public void setLabitemrcdflow(String labitemrcdflow) {
        this.labitemrcdflow = labitemrcdflow == null ? null : labitemrcdflow.trim();
    }

    public String getLabflow() {
        return labflow;
    }

    public void setLabflow(String labflow) {
        this.labflow = labflow == null ? null : labflow.trim();
    }

    public String getLabrepitemcode() {
        return labrepitemcode;
    }

    public void setLabrepitemcode(String labrepitemcode) {
        this.labrepitemcode = labrepitemcode == null ? null : labrepitemcode.trim();
    }

    public String getLabrepitemname() {
        return labrepitemname;
    }

    public void setLabrepitemname(String labrepitemname) {
        this.labrepitemname = labrepitemname == null ? null : labrepitemname.trim();
    }

    public String getResulttype() {
        return resulttype;
    }

    public void setResulttype(String resulttype) {
        this.resulttype = resulttype == null ? null : resulttype.trim();
    }

    public String getResultnum() {
        return resultnum;
    }

    public void setResultnum(String resultnum) {
        this.resultnum = resultnum == null ? null : resultnum.trim();
    }

    public String getResulttext() {
        return resulttext;
    }

    public void setResulttext(String resulttext) {
        this.resulttext = resulttext == null ? null : resulttext.trim();
    }

    public String getReferencetext() {
        return referencetext;
    }

    public void setReferencetext(String referencetext) {
        this.referencetext = referencetext == null ? null : referencetext.trim();
    }

    public String getLabrepitemunit() {
        return labrepitemunit;
    }

    public void setLabrepitemunit(String labrepitemunit) {
        this.labrepitemunit = labrepitemunit == null ? null : labrepitemunit.trim();
    }

    public String getChangeflag() {
        return changeflag;
    }

    public void setChangeflag(String changeflag) {
        this.changeflag = changeflag == null ? null : changeflag.trim();
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