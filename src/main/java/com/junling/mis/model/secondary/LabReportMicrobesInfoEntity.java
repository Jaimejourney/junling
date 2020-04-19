package com.junling.mis.model.secondary;

import java.util.Date;

public class LabReportMicrobesInfoEntity {
    private String recordmicrobesflow;

    private String labitemrcdflow;

    private String lrmicrobessn;

    private String labrepitemcode;

    private String labrepitemname;

    private String kb;

    private String resulttext;

    private String sensitivity;

    private String bloodconcentration;

    private String urineconcentration;

    private String drugsensitivecode;

    private String additionalresult;

    private String usemethod;

    private String bloodconcentraother;

    private String urineconcentraother;

    private String usemethodother;

    private String bacteriostatdiameter;

    private String ncclsreferencevalue;

    private String updatePoson;

    private Date updateTime;

    private Long isDelete;

    public String getRecordmicrobesflow() {
        return recordmicrobesflow;
    }

    public void setRecordmicrobesflow(String recordmicrobesflow) {
        this.recordmicrobesflow = recordmicrobesflow == null ? null : recordmicrobesflow.trim();
    }

    public String getLabitemrcdflow() {
        return labitemrcdflow;
    }

    public void setLabitemrcdflow(String labitemrcdflow) {
        this.labitemrcdflow = labitemrcdflow == null ? null : labitemrcdflow.trim();
    }

    public String getLrmicrobessn() {
        return lrmicrobessn;
    }

    public void setLrmicrobessn(String lrmicrobessn) {
        this.lrmicrobessn = lrmicrobessn == null ? null : lrmicrobessn.trim();
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

    public String getKb() {
        return kb;
    }

    public void setKb(String kb) {
        this.kb = kb == null ? null : kb.trim();
    }

    public String getResulttext() {
        return resulttext;
    }

    public void setResulttext(String resulttext) {
        this.resulttext = resulttext == null ? null : resulttext.trim();
    }

    public String getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity == null ? null : sensitivity.trim();
    }

    public String getBloodconcentration() {
        return bloodconcentration;
    }

    public void setBloodconcentration(String bloodconcentration) {
        this.bloodconcentration = bloodconcentration == null ? null : bloodconcentration.trim();
    }

    public String getUrineconcentration() {
        return urineconcentration;
    }

    public void setUrineconcentration(String urineconcentration) {
        this.urineconcentration = urineconcentration == null ? null : urineconcentration.trim();
    }

    public String getDrugsensitivecode() {
        return drugsensitivecode;
    }

    public void setDrugsensitivecode(String drugsensitivecode) {
        this.drugsensitivecode = drugsensitivecode == null ? null : drugsensitivecode.trim();
    }

    public String getAdditionalresult() {
        return additionalresult;
    }

    public void setAdditionalresult(String additionalresult) {
        this.additionalresult = additionalresult == null ? null : additionalresult.trim();
    }

    public String getUsemethod() {
        return usemethod;
    }

    public void setUsemethod(String usemethod) {
        this.usemethod = usemethod == null ? null : usemethod.trim();
    }

    public String getBloodconcentraother() {
        return bloodconcentraother;
    }

    public void setBloodconcentraother(String bloodconcentraother) {
        this.bloodconcentraother = bloodconcentraother == null ? null : bloodconcentraother.trim();
    }

    public String getUrineconcentraother() {
        return urineconcentraother;
    }

    public void setUrineconcentraother(String urineconcentraother) {
        this.urineconcentraother = urineconcentraother == null ? null : urineconcentraother.trim();
    }

    public String getUsemethodother() {
        return usemethodother;
    }

    public void setUsemethodother(String usemethodother) {
        this.usemethodother = usemethodother == null ? null : usemethodother.trim();
    }

    public String getBacteriostatdiameter() {
        return bacteriostatdiameter;
    }

    public void setBacteriostatdiameter(String bacteriostatdiameter) {
        this.bacteriostatdiameter = bacteriostatdiameter == null ? null : bacteriostatdiameter.trim();
    }

    public String getNcclsreferencevalue() {
        return ncclsreferencevalue;
    }

    public void setNcclsreferencevalue(String ncclsreferencevalue) {
        this.ncclsreferencevalue = ncclsreferencevalue == null ? null : ncclsreferencevalue.trim();
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