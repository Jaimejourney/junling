package com.junling.mis.model.secondary;

import java.util.Date;

public class ClaimSeriousDiseaseEntity {
    private Integer id;

    private String docuno;

    private String accno;

    private String seriousdiseasecode;

    private String seriousdiseasename;

    private String seriousdocter;

    private Date diagnosedate;

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

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno == null ? null : accno.trim();
    }

    public String getSeriousdiseasecode() {
        return seriousdiseasecode;
    }

    public void setSeriousdiseasecode(String seriousdiseasecode) {
        this.seriousdiseasecode = seriousdiseasecode == null ? null : seriousdiseasecode.trim();
    }

    public String getSeriousdiseasename() {
        return seriousdiseasename;
    }

    public void setSeriousdiseasename(String seriousdiseasename) {
        this.seriousdiseasename = seriousdiseasename == null ? null : seriousdiseasename.trim();
    }

    public String getSeriousdocter() {
        return seriousdocter;
    }

    public void setSeriousdocter(String seriousdocter) {
        this.seriousdocter = seriousdocter == null ? null : seriousdocter.trim();
    }

    public Date getDiagnosedate() {
        return diagnosedate;
    }

    public void setDiagnosedate(Date diagnosedate) {
        this.diagnosedate = diagnosedate;
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