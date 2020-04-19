package com.junling.mis.model.secondary;

import java.util.Date;

public class ClaimAccEntity {
    private Integer id;

    private String docuno;

    private String accno;

    private Date accdate;

    private String acctype;

    private String accprovicecode;

    private String acccitycode;

    private String acccountycode;

    private String accplace;

    private Date inhospitaldate;

    private Date outhospitaldate;

    private String accdesc;

    private Date createddate;

    private Date updateddate;

    private String conclusionbasistype;

    private String majordiseasename;

    private String majordiseasecode;

    private Date confirmdate;

    private Long paidamnt;

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

    public Date getAccdate() {
        return accdate;
    }

    public void setAccdate(Date accdate) {
        this.accdate = accdate;
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype == null ? null : acctype.trim();
    }

    public String getAccprovicecode() {
        return accprovicecode;
    }

    public void setAccprovicecode(String accprovicecode) {
        this.accprovicecode = accprovicecode == null ? null : accprovicecode.trim();
    }

    public String getAcccitycode() {
        return acccitycode;
    }

    public void setAcccitycode(String acccitycode) {
        this.acccitycode = acccitycode == null ? null : acccitycode.trim();
    }

    public String getAcccountycode() {
        return acccountycode;
    }

    public void setAcccountycode(String acccountycode) {
        this.acccountycode = acccountycode == null ? null : acccountycode.trim();
    }

    public String getAccplace() {
        return accplace;
    }

    public void setAccplace(String accplace) {
        this.accplace = accplace == null ? null : accplace.trim();
    }

    public Date getInhospitaldate() {
        return inhospitaldate;
    }

    public void setInhospitaldate(Date inhospitaldate) {
        this.inhospitaldate = inhospitaldate;
    }

    public Date getOuthospitaldate() {
        return outhospitaldate;
    }

    public void setOuthospitaldate(Date outhospitaldate) {
        this.outhospitaldate = outhospitaldate;
    }

    public String getAccdesc() {
        return accdesc;
    }

    public void setAccdesc(String accdesc) {
        this.accdesc = accdesc == null ? null : accdesc.trim();
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

    public String getConclusionbasistype() {
        return conclusionbasistype;
    }

    public void setConclusionbasistype(String conclusionbasistype) {
        this.conclusionbasistype = conclusionbasistype == null ? null : conclusionbasistype.trim();
    }

    public String getMajordiseasename() {
        return majordiseasename;
    }

    public void setMajordiseasename(String majordiseasename) {
        this.majordiseasename = majordiseasename == null ? null : majordiseasename.trim();
    }

    public String getMajordiseasecode() {
        return majordiseasecode;
    }

    public void setMajordiseasecode(String majordiseasecode) {
        this.majordiseasecode = majordiseasecode == null ? null : majordiseasecode.trim();
    }

    public Date getConfirmdate() {
        return confirmdate;
    }

    public void setConfirmdate(Date confirmdate) {
        this.confirmdate = confirmdate;
    }

    public Long getPaidamnt() {
        return paidamnt;
    }

    public void setPaidamnt(Long paidamnt) {
        this.paidamnt = paidamnt;
    }
}