package com.junling.mis.model.secondary;

import java.util.Date;

public class RiskDetailEntity {
    private Integer riskdetailid;

    private String visitpersonid;

    private String areaname;

    private String originhospitalname;

    private String areacode;

    private Integer inhospitalday;

    private String hospitalname;

    private String diagnoseresult;

    private String medicaltype;

    private String hospitalcode;

    private Long starttime;

    private Long endtime;

    private Date createtime;

    public Integer getRiskdetailid() {
        return riskdetailid;
    }

    public void setRiskdetailid(Integer riskdetailid) {
        this.riskdetailid = riskdetailid;
    }

    public String getVisitpersonid() {
        return visitpersonid;
    }

    public void setVisitpersonid(String visitpersonid) {
        this.visitpersonid = visitpersonid == null ? null : visitpersonid.trim();
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public String getOriginhospitalname() {
        return originhospitalname;
    }

    public void setOriginhospitalname(String originhospitalname) {
        this.originhospitalname = originhospitalname == null ? null : originhospitalname.trim();
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }

    public Integer getInhospitalday() {
        return inhospitalday;
    }

    public void setInhospitalday(Integer inhospitalday) {
        this.inhospitalday = inhospitalday;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname == null ? null : hospitalname.trim();
    }

    public String getDiagnoseresult() {
        return diagnoseresult;
    }

    public void setDiagnoseresult(String diagnoseresult) {
        this.diagnoseresult = diagnoseresult == null ? null : diagnoseresult.trim();
    }

    public String getMedicaltype() {
        return medicaltype;
    }

    public void setMedicaltype(String medicaltype) {
        this.medicaltype = medicaltype == null ? null : medicaltype.trim();
    }

    public String getHospitalcode() {
        return hospitalcode;
    }

    public void setHospitalcode(String hospitalcode) {
        this.hospitalcode = hospitalcode == null ? null : hospitalcode.trim();
    }

    public Long getStarttime() {
        return starttime;
    }

    public void setStarttime(Long starttime) {
        this.starttime = starttime;
    }

    public Long getEndtime() {
        return endtime;
    }

    public void setEndtime(Long endtime) {
        this.endtime = endtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}