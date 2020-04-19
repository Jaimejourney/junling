package com.junling.mis.model.secondary;

import java.util.Date;

public class TpaHisrReceiptInfoEntity {
    private Integer id;

    private String docuno;

    private String polno;

    private String insuredId;

    private String creceiptno;

    private String createdBy;

    private Date createdDate;

    private String updatedBy;

    private Date updatedDate;

    private String inhospitaldate;

    private String outhospitaldate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno == null ? null : docuno.trim();
    }

    public String getPolno() {
        return polno;
    }

    public void setPolno(String polno) {
        this.polno = polno == null ? null : polno.trim();
    }

    public String getInsuredId() {
        return insuredId;
    }

    public void setInsuredId(String insuredId) {
        this.insuredId = insuredId == null ? null : insuredId.trim();
    }

    public String getCreceiptno() {
        return creceiptno;
    }

    public void setCreceiptno(String creceiptno) {
        this.creceiptno = creceiptno == null ? null : creceiptno.trim();
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

    public String getInhospitaldate() {
        return inhospitaldate;
    }

    public void setInhospitaldate(String inhospitaldate) {
        this.inhospitaldate = inhospitaldate == null ? null : inhospitaldate.trim();
    }

    public String getOuthospitaldate() {
        return outhospitaldate;
    }

    public void setOuthospitaldate(String outhospitaldate) {
        this.outhospitaldate = outhospitaldate == null ? null : outhospitaldate.trim();
    }
}