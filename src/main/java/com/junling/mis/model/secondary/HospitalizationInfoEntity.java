package com.junling.mis.model.secondary;

import java.util.Date;

public class HospitalizationInfoEntity {
    private String id;

    private String docuno;

    private String flowId;

    private String isYbPatient;

    private String regionNameHb;

    private String institutionalId;

    private String therapyTypeHb;

    private String doctorRegId;

    private String doctorName;

    private Date dateAdmission;

    private String admissionDepartmentCodeHb;

    private String admissionDepartmentNameHb;

    private String isDbzPa;

    private String diagnosisCode1Hb;

    private String diagnosisName1Hb;

    private String diagnosisCode2Hb;

    private String diagnosisName2Hb;

    private String diagnosisCode3Hb;

    private String diagnosisName3Hb;

    private String updatePoson;

    private Date updateTime;

    private Long isDelete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno == null ? null : docuno.trim();
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

    public String getIsYbPatient() {
        return isYbPatient;
    }

    public void setIsYbPatient(String isYbPatient) {
        this.isYbPatient = isYbPatient == null ? null : isYbPatient.trim();
    }

    public String getRegionNameHb() {
        return regionNameHb;
    }

    public void setRegionNameHb(String regionNameHb) {
        this.regionNameHb = regionNameHb == null ? null : regionNameHb.trim();
    }

    public String getInstitutionalId() {
        return institutionalId;
    }

    public void setInstitutionalId(String institutionalId) {
        this.institutionalId = institutionalId == null ? null : institutionalId.trim();
    }

    public String getTherapyTypeHb() {
        return therapyTypeHb;
    }

    public void setTherapyTypeHb(String therapyTypeHb) {
        this.therapyTypeHb = therapyTypeHb == null ? null : therapyTypeHb.trim();
    }

    public String getDoctorRegId() {
        return doctorRegId;
    }

    public void setDoctorRegId(String doctorRegId) {
        this.doctorRegId = doctorRegId == null ? null : doctorRegId.trim();
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    public Date getDateAdmission() {
        return dateAdmission;
    }

    public void setDateAdmission(Date dateAdmission) {
        this.dateAdmission = dateAdmission;
    }

    public String getAdmissionDepartmentCodeHb() {
        return admissionDepartmentCodeHb;
    }

    public void setAdmissionDepartmentCodeHb(String admissionDepartmentCodeHb) {
        this.admissionDepartmentCodeHb = admissionDepartmentCodeHb == null ? null : admissionDepartmentCodeHb.trim();
    }

    public String getAdmissionDepartmentNameHb() {
        return admissionDepartmentNameHb;
    }

    public void setAdmissionDepartmentNameHb(String admissionDepartmentNameHb) {
        this.admissionDepartmentNameHb = admissionDepartmentNameHb == null ? null : admissionDepartmentNameHb.trim();
    }

    public String getIsDbzPa() {
        return isDbzPa;
    }

    public void setIsDbzPa(String isDbzPa) {
        this.isDbzPa = isDbzPa == null ? null : isDbzPa.trim();
    }

    public String getDiagnosisCode1Hb() {
        return diagnosisCode1Hb;
    }

    public void setDiagnosisCode1Hb(String diagnosisCode1Hb) {
        this.diagnosisCode1Hb = diagnosisCode1Hb == null ? null : diagnosisCode1Hb.trim();
    }

    public String getDiagnosisName1Hb() {
        return diagnosisName1Hb;
    }

    public void setDiagnosisName1Hb(String diagnosisName1Hb) {
        this.diagnosisName1Hb = diagnosisName1Hb == null ? null : diagnosisName1Hb.trim();
    }

    public String getDiagnosisCode2Hb() {
        return diagnosisCode2Hb;
    }

    public void setDiagnosisCode2Hb(String diagnosisCode2Hb) {
        this.diagnosisCode2Hb = diagnosisCode2Hb == null ? null : diagnosisCode2Hb.trim();
    }

    public String getDiagnosisName2Hb() {
        return diagnosisName2Hb;
    }

    public void setDiagnosisName2Hb(String diagnosisName2Hb) {
        this.diagnosisName2Hb = diagnosisName2Hb == null ? null : diagnosisName2Hb.trim();
    }

    public String getDiagnosisCode3Hb() {
        return diagnosisCode3Hb;
    }

    public void setDiagnosisCode3Hb(String diagnosisCode3Hb) {
        this.diagnosisCode3Hb = diagnosisCode3Hb == null ? null : diagnosisCode3Hb.trim();
    }

    public String getDiagnosisName3Hb() {
        return diagnosisName3Hb;
    }

    public void setDiagnosisName3Hb(String diagnosisName3Hb) {
        this.diagnosisName3Hb = diagnosisName3Hb == null ? null : diagnosisName3Hb.trim();
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