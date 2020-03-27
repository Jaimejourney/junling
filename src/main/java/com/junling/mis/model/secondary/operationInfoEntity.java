package com.junling.mis.model.secondary;

import java.util.Date;

public class operationInfoEntity {
    private Integer id;

    private String sendtradenum;

    private String medicalnum;

    private String operationcode;

    private String operationname;

    private Date createdDate;

    private Date updatedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSendtradenum() {
        return sendtradenum;
    }

    public void setSendtradenum(String sendtradenum) {
        this.sendtradenum = sendtradenum == null ? null : sendtradenum.trim();
    }

    public String getMedicalnum() {
        return medicalnum;
    }

    public void setMedicalnum(String medicalnum) {
        this.medicalnum = medicalnum == null ? null : medicalnum.trim();
    }

    public String getOperationcode() {
        return operationcode;
    }

    public void setOperationcode(String operationcode) {
        this.operationcode = operationcode == null ? null : operationcode.trim();
    }

    public String getOperationname() {
        return operationname;
    }

    public void setOperationname(String operationname) {
        this.operationname = operationname == null ? null : operationname.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}