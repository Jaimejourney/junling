package com.junling.mis.model.secondary;

import java.util.Date;

public class claimBillAccidentEntity {
    private Integer id;

    private String docuno;

    private String receiptno;

    private String accno;

    private String accidentcode;

    private String accidentname;

    private Date createddate;

    private Date updateddate;

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

    public String getReceiptno() {
        return receiptno;
    }

    public void setReceiptno(String receiptno) {
        this.receiptno = receiptno == null ? null : receiptno.trim();
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno == null ? null : accno.trim();
    }

    public String getAccidentcode() {
        return accidentcode;
    }

    public void setAccidentcode(String accidentcode) {
        this.accidentcode = accidentcode == null ? null : accidentcode.trim();
    }

    public String getAccidentname() {
        return accidentname;
    }

    public void setAccidentname(String accidentname) {
        this.accidentname = accidentname == null ? null : accidentname.trim();
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Date getUpdateddate() {
        return updateddate;
    }

    public void setUpdateddate(Date updateddate) {
        this.updateddate = updateddate;
    }
}