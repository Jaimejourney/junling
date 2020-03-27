package com.junling.mis.model.secondary;

import java.util.Date;

public class inspectionReportEntity {
    private String id;

    private String flowId;

    private String recordflow;

    private String examrptflow;

    private String examname;

    private String examdiagnose;

    private String examreportercode;

    private String examreporter;

    private Date examtime;

    private String audituserid;

    private String auditusername;

    private Date audittime;

    private String applierid;

    private String applier;

    private Date applytime;

    private String findings;

    private String result;

    private String examinationcode;

    private String examinationname;

    private String examinationvalue;

    private String inoutflag;

    private String isdelete;

    private String applierdeptcode;

    private String applierdept;

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

    public String getRecordflow() {
        return recordflow;
    }

    public void setRecordflow(String recordflow) {
        this.recordflow = recordflow == null ? null : recordflow.trim();
    }

    public String getExamrptflow() {
        return examrptflow;
    }

    public void setExamrptflow(String examrptflow) {
        this.examrptflow = examrptflow == null ? null : examrptflow.trim();
    }

    public String getExamname() {
        return examname;
    }

    public void setExamname(String examname) {
        this.examname = examname == null ? null : examname.trim();
    }

    public String getExamdiagnose() {
        return examdiagnose;
    }

    public void setExamdiagnose(String examdiagnose) {
        this.examdiagnose = examdiagnose == null ? null : examdiagnose.trim();
    }

    public String getExamreportercode() {
        return examreportercode;
    }

    public void setExamreportercode(String examreportercode) {
        this.examreportercode = examreportercode == null ? null : examreportercode.trim();
    }

    public String getExamreporter() {
        return examreporter;
    }

    public void setExamreporter(String examreporter) {
        this.examreporter = examreporter == null ? null : examreporter.trim();
    }

    public Date getExamtime() {
        return examtime;
    }

    public void setExamtime(Date examtime) {
        this.examtime = examtime;
    }

    public String getAudituserid() {
        return audituserid;
    }

    public void setAudituserid(String audituserid) {
        this.audituserid = audituserid == null ? null : audituserid.trim();
    }

    public String getAuditusername() {
        return auditusername;
    }

    public void setAuditusername(String auditusername) {
        this.auditusername = auditusername == null ? null : auditusername.trim();
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    public String getApplierid() {
        return applierid;
    }

    public void setApplierid(String applierid) {
        this.applierid = applierid == null ? null : applierid.trim();
    }

    public String getApplier() {
        return applier;
    }

    public void setApplier(String applier) {
        this.applier = applier == null ? null : applier.trim();
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public String getFindings() {
        return findings;
    }

    public void setFindings(String findings) {
        this.findings = findings == null ? null : findings.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getExaminationcode() {
        return examinationcode;
    }

    public void setExaminationcode(String examinationcode) {
        this.examinationcode = examinationcode == null ? null : examinationcode.trim();
    }

    public String getExaminationname() {
        return examinationname;
    }

    public void setExaminationname(String examinationname) {
        this.examinationname = examinationname == null ? null : examinationname.trim();
    }

    public String getExaminationvalue() {
        return examinationvalue;
    }

    public void setExaminationvalue(String examinationvalue) {
        this.examinationvalue = examinationvalue == null ? null : examinationvalue.trim();
    }

    public String getInoutflag() {
        return inoutflag;
    }

    public void setInoutflag(String inoutflag) {
        this.inoutflag = inoutflag == null ? null : inoutflag.trim();
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete == null ? null : isdelete.trim();
    }

    public String getApplierdeptcode() {
        return applierdeptcode;
    }

    public void setApplierdeptcode(String applierdeptcode) {
        this.applierdeptcode = applierdeptcode == null ? null : applierdeptcode.trim();
    }

    public String getApplierdept() {
        return applierdept;
    }

    public void setApplierdept(String applierdept) {
        this.applierdept = applierdept == null ? null : applierdept.trim();
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