package com.junling.mis.model.secondary;

import java.util.Date;

public class ClaimSeriousDiseaseDiagnoseEntity {
    private Integer id;

    private String docuno;

    private String accno;

    private String seriousdiseasecode;

    private String diagnosecode;

    private String diagnosename;

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

    public String getDiagnosecode() {
        return diagnosecode;
    }

    public void setDiagnosecode(String diagnosecode) {
        this.diagnosecode = diagnosecode == null ? null : diagnosecode.trim();
    }

    public String getDiagnosename() {
        return diagnosename;
    }

    public void setDiagnosename(String diagnosename) {
        this.diagnosename = diagnosename == null ? null : diagnosename.trim();
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