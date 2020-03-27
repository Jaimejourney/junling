package com.junling.mis.model.secondary;

import java.util.Date;

public class invoiceProblemEntity {
    private Integer id;

    private String sendtradenum;

    private String docuno;

    private String invoiceno;

    private String signBackType;

    private String signBackDesc;

    private String createdBy;

    private Date createdDate;

    private String updatedBy;

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

    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno == null ? null : docuno.trim();
    }

    public String getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno == null ? null : invoiceno.trim();
    }

    public String getSignBackType() {
        return signBackType;
    }

    public void setSignBackType(String signBackType) {
        this.signBackType = signBackType == null ? null : signBackType.trim();
    }

    public String getSignBackDesc() {
        return signBackDesc;
    }

    public void setSignBackDesc(String signBackDesc) {
        this.signBackDesc = signBackDesc == null ? null : signBackDesc.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}