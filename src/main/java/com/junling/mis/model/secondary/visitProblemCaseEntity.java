package com.junling.mis.model.secondary;

import java.util.Date;

public class visitProblemCaseEntity {
    private Integer id;

    private String visitRecordId;

    private Date applyTime;

    private String description;

    private String type;

    private String userId;

    private String reply;

    private Date updatedDate;

    private Date replyTime;

    private Long other;

    private String surveyconclusion;

    private String surveyunit;

    private String surveyscope;

    private String amount;

    private String examcomment;

    private String caseformula;

    private String visitHospital;

    private String diseaseDiagnosis;

    private String province;

    private String city;

    private String area;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVisitRecordId() {
        return visitRecordId;
    }

    public void setVisitRecordId(String visitRecordId) {
        this.visitRecordId = visitRecordId == null ? null : visitRecordId.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply == null ? null : reply.trim();
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public Long getOther() {
        return other;
    }

    public void setOther(Long other) {
        this.other = other;
    }

    public String getSurveyconclusion() {
        return surveyconclusion;
    }

    public void setSurveyconclusion(String surveyconclusion) {
        this.surveyconclusion = surveyconclusion == null ? null : surveyconclusion.trim();
    }

    public String getSurveyunit() {
        return surveyunit;
    }

    public void setSurveyunit(String surveyunit) {
        this.surveyunit = surveyunit == null ? null : surveyunit.trim();
    }

    public String getSurveyscope() {
        return surveyscope;
    }

    public void setSurveyscope(String surveyscope) {
        this.surveyscope = surveyscope == null ? null : surveyscope.trim();
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public String getExamcomment() {
        return examcomment;
    }

    public void setExamcomment(String examcomment) {
        this.examcomment = examcomment == null ? null : examcomment.trim();
    }

    public String getCaseformula() {
        return caseformula;
    }

    public void setCaseformula(String caseformula) {
        this.caseformula = caseformula == null ? null : caseformula.trim();
    }

    public String getVisitHospital() {
        return visitHospital;
    }

    public void setVisitHospital(String visitHospital) {
        this.visitHospital = visitHospital == null ? null : visitHospital.trim();
    }

    public String getDiseaseDiagnosis() {
        return diseaseDiagnosis;
    }

    public void setDiseaseDiagnosis(String diseaseDiagnosis) {
        this.diseaseDiagnosis = diseaseDiagnosis == null ? null : diseaseDiagnosis.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }
}