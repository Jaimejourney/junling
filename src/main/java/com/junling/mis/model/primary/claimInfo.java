package com.junling.mis.model.primary;

import java.util.Date;

public class claimInfo extends claimInfoKey {
    private String policyOrganization;

    private String claimReportId;

    private String insureId;

    private Date examTime;

    private String districtCode;

    private String accidentType;

    private String accidentDes;

    private Date reportTime;

    private String reportType;

    private Integer examEstimateAmount;

    private Integer examAmount;

    private Date endDate;

    private Date filingTime;

    private String claimOption;

    private String claimResult;

    private String claimStatus;

    private Integer claimAmount;

    private String claimSoucreType;

    private String rejectCauseCode;

    private String rejectCause;

    private String operationFlr;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getPolicyOrganization() {
        return policyOrganization;
    }

    public void setPolicyOrganization(String policyOrganization) {
        this.policyOrganization = policyOrganization == null ? null : policyOrganization.trim();
    }

    public String getClaimReportId() {
        return claimReportId;
    }

    public void setClaimReportId(String claimReportId) {
        this.claimReportId = claimReportId == null ? null : claimReportId.trim();
    }

    public String getInsureId() {
        return insureId;
    }

    public void setInsureId(String insureId) {
        this.insureId = insureId == null ? null : insureId.trim();
    }

    public Date getExamTime() {
        return examTime;
    }

    public void setExamTime(Date examTime) {
        this.examTime = examTime;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode == null ? null : districtCode.trim();
    }

    public String getAccidentType() {
        return accidentType;
    }

    public void setAccidentType(String accidentType) {
        this.accidentType = accidentType == null ? null : accidentType.trim();
    }

    public String getAccidentDes() {
        return accidentDes;
    }

    public void setAccidentDes(String accidentDes) {
        this.accidentDes = accidentDes == null ? null : accidentDes.trim();
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType == null ? null : reportType.trim();
    }

    public Integer getExamEstimateAmount() {
        return examEstimateAmount;
    }

    public void setExamEstimateAmount(Integer examEstimateAmount) {
        this.examEstimateAmount = examEstimateAmount;
    }

    public Integer getExamAmount() {
        return examAmount;
    }

    public void setExamAmount(Integer examAmount) {
        this.examAmount = examAmount;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getFilingTime() {
        return filingTime;
    }

    public void setFilingTime(Date filingTime) {
        this.filingTime = filingTime;
    }

    public String getClaimOption() {
        return claimOption;
    }

    public void setClaimOption(String claimOption) {
        this.claimOption = claimOption == null ? null : claimOption.trim();
    }

    public String getClaimResult() {
        return claimResult;
    }

    public void setClaimResult(String claimResult) {
        this.claimResult = claimResult == null ? null : claimResult.trim();
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus == null ? null : claimStatus.trim();
    }

    public Integer getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(Integer claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getClaimSoucreType() {
        return claimSoucreType;
    }

    public void setClaimSoucreType(String claimSoucreType) {
        this.claimSoucreType = claimSoucreType == null ? null : claimSoucreType.trim();
    }

    public String getRejectCauseCode() {
        return rejectCauseCode;
    }

    public void setRejectCauseCode(String rejectCauseCode) {
        this.rejectCauseCode = rejectCauseCode == null ? null : rejectCauseCode.trim();
    }

    public String getRejectCause() {
        return rejectCause;
    }

    public void setRejectCause(String rejectCause) {
        this.rejectCause = rejectCause == null ? null : rejectCause.trim();
    }

    public String getOperationFlr() {
        return operationFlr;
    }

    public void setOperationFlr(String operationFlr) {
        this.operationFlr = operationFlr == null ? null : operationFlr.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}