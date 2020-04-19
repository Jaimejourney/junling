package com.junling.mis.model.secondary;

import java.math.BigDecimal;
import java.util.Date;

public class VisitFeedbackEntity {
    private BigDecimal id;

    private String recordId;

    private String indemnityId;

    private String unitId;

    private String corporateName;

    private String customerTime;

    private String isUrgent;

    private String caseId;

    private String insurerRel;

    private String insurerName;

    private String optNum;

    private String optName;

    private String birthday;

    private String cardType;

    private String cardNum;

    private String invoiceCount;

    private String datumCount;

    private String remark;

    private String caseSources;

    private String expand1;

    private String expand2;

    private String expand3;

    private Integer type;

    private Date createTime;

    private String updatePoson;

    private Date updateTime;

    private Long isDelete;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getIndemnityId() {
        return indemnityId;
    }

    public void setIndemnityId(String indemnityId) {
        this.indemnityId = indemnityId == null ? null : indemnityId.trim();
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName == null ? null : corporateName.trim();
    }

    public String getCustomerTime() {
        return customerTime;
    }

    public void setCustomerTime(String customerTime) {
        this.customerTime = customerTime == null ? null : customerTime.trim();
    }

    public String getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(String isUrgent) {
        this.isUrgent = isUrgent == null ? null : isUrgent.trim();
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId == null ? null : caseId.trim();
    }

    public String getInsurerRel() {
        return insurerRel;
    }

    public void setInsurerRel(String insurerRel) {
        this.insurerRel = insurerRel == null ? null : insurerRel.trim();
    }

    public String getInsurerName() {
        return insurerName;
    }

    public void setInsurerName(String insurerName) {
        this.insurerName = insurerName == null ? null : insurerName.trim();
    }

    public String getOptNum() {
        return optNum;
    }

    public void setOptNum(String optNum) {
        this.optNum = optNum == null ? null : optNum.trim();
    }

    public String getOptName() {
        return optName;
    }

    public void setOptName(String optName) {
        this.optName = optName == null ? null : optName.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }

    public String getInvoiceCount() {
        return invoiceCount;
    }

    public void setInvoiceCount(String invoiceCount) {
        this.invoiceCount = invoiceCount == null ? null : invoiceCount.trim();
    }

    public String getDatumCount() {
        return datumCount;
    }

    public void setDatumCount(String datumCount) {
        this.datumCount = datumCount == null ? null : datumCount.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCaseSources() {
        return caseSources;
    }

    public void setCaseSources(String caseSources) {
        this.caseSources = caseSources == null ? null : caseSources.trim();
    }

    public String getExpand1() {
        return expand1;
    }

    public void setExpand1(String expand1) {
        this.expand1 = expand1 == null ? null : expand1.trim();
    }

    public String getExpand2() {
        return expand2;
    }

    public void setExpand2(String expand2) {
        this.expand2 = expand2 == null ? null : expand2.trim();
    }

    public String getExpand3() {
        return expand3;
    }

    public void setExpand3(String expand3) {
        this.expand3 = expand3 == null ? null : expand3.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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