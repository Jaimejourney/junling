package com.junling.mis.model.secondary;

import java.util.Date;

public class RenbaoEndCaseEntity {
    private Integer id;

    private String caseno;

    private String contno;

    private String idno;

    private String endcasedate;

    private String claimno;

    private String outdutyamnt;

    private String realpay;

    private Date createddate;

    private Date updateddate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaseno() {
        return caseno;
    }

    public void setCaseno(String caseno) {
        this.caseno = caseno == null ? null : caseno.trim();
    }

    public String getContno() {
        return contno;
    }

    public void setContno(String contno) {
        this.contno = contno == null ? null : contno.trim();
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getEndcasedate() {
        return endcasedate;
    }

    public void setEndcasedate(String endcasedate) {
        this.endcasedate = endcasedate == null ? null : endcasedate.trim();
    }

    public String getClaimno() {
        return claimno;
    }

    public void setClaimno(String claimno) {
        this.claimno = claimno == null ? null : claimno.trim();
    }

    public String getOutdutyamnt() {
        return outdutyamnt;
    }

    public void setOutdutyamnt(String outdutyamnt) {
        this.outdutyamnt = outdutyamnt == null ? null : outdutyamnt.trim();
    }

    public String getRealpay() {
        return realpay;
    }

    public void setRealpay(String realpay) {
        this.realpay = realpay == null ? null : realpay.trim();
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