package com.junling.mis.model.secondary;

import java.util.Date;

public class dischargeSummaryEntity {
    private String id;

    private String flowId;

    private String name;

    private String genderCode;

    private String admissionId;

    private String admissionDepartmentCodeHb;

    private String admissionDepartmentNameHb;

    private Date dateAdmission;

    private String inhossituation;

    private String inhosdiagnosis;

    private String diagnosistreatment;

    private Date dateDischarge;

    private String dischdiagnosis;

    private String dischadvice;

    private String dischargesummary;

    private Date createTime;

    private String updatePoson;

    private Date updateTime;

    private Long isDelete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode == null ? null : genderCode.trim();
    }

    public String getAdmissionId() {
        return admissionId;
    }

    public void setAdmissionId(String admissionId) {
        this.admissionId = admissionId == null ? null : admissionId.trim();
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

    public Date getDateAdmission() {
        return dateAdmission;
    }

    public void setDateAdmission(Date dateAdmission) {
        this.dateAdmission = dateAdmission;
    }

    public String getInhossituation() {
        return inhossituation;
    }

    public void setInhossituation(String inhossituation) {
        this.inhossituation = inhossituation == null ? null : inhossituation.trim();
    }

    public String getInhosdiagnosis() {
        return inhosdiagnosis;
    }

    public void setInhosdiagnosis(String inhosdiagnosis) {
        this.inhosdiagnosis = inhosdiagnosis == null ? null : inhosdiagnosis.trim();
    }

    public String getDiagnosistreatment() {
        return diagnosistreatment;
    }

    public void setDiagnosistreatment(String diagnosistreatment) {
        this.diagnosistreatment = diagnosistreatment == null ? null : diagnosistreatment.trim();
    }

    public Date getDateDischarge() {
        return dateDischarge;
    }

    public void setDateDischarge(Date dateDischarge) {
        this.dateDischarge = dateDischarge;
    }

    public String getDischdiagnosis() {
        return dischdiagnosis;
    }

    public void setDischdiagnosis(String dischdiagnosis) {
        this.dischdiagnosis = dischdiagnosis == null ? null : dischdiagnosis.trim();
    }

    public String getDischadvice() {
        return dischadvice;
    }

    public void setDischadvice(String dischadvice) {
        this.dischadvice = dischadvice == null ? null : dischadvice.trim();
    }

    public String getDischargesummary() {
        return dischargesummary;
    }

    public void setDischargesummary(String dischargesummary) {
        this.dischargesummary = dischargesummary == null ? null : dischargesummary.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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