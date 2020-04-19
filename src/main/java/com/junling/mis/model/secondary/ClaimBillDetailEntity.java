package com.junling.mis.model.secondary;

import java.util.Date;

public class ClaimBillDetailEntity {
    private String id;

    private String seqno;

    private String itemId;

    private String feeType;

    private String itemType;

    private String itemCode;

    private String itemLevelCode;

    private String zfRatio;

    private Long itemAmt;

    private Long allOwnAmt;

    private Long subOwnAmt;

    private Long ybLookupAmt;

    private String prescriptionId;

    private Date prescriptionDate;

    private String doctorRegId;

    private String doctorName;

    private String departCodeHb;

    private String departNameHb;

    private String updatePoson;

    private Date updateTime;

    private Long isDelete;

    private String docuno;

    private String hospitalName;

    private String hospitalCode;

    private String itemName;

    private String receiptno;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno == null ? null : seqno.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType == null ? null : itemType.trim();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public String getItemLevelCode() {
        return itemLevelCode;
    }

    public void setItemLevelCode(String itemLevelCode) {
        this.itemLevelCode = itemLevelCode == null ? null : itemLevelCode.trim();
    }

    public String getZfRatio() {
        return zfRatio;
    }

    public void setZfRatio(String zfRatio) {
        this.zfRatio = zfRatio == null ? null : zfRatio.trim();
    }

    public Long getItemAmt() {
        return itemAmt;
    }

    public void setItemAmt(Long itemAmt) {
        this.itemAmt = itemAmt;
    }

    public Long getAllOwnAmt() {
        return allOwnAmt;
    }

    public void setAllOwnAmt(Long allOwnAmt) {
        this.allOwnAmt = allOwnAmt;
    }

    public Long getSubOwnAmt() {
        return subOwnAmt;
    }

    public void setSubOwnAmt(Long subOwnAmt) {
        this.subOwnAmt = subOwnAmt;
    }

    public Long getYbLookupAmt() {
        return ybLookupAmt;
    }

    public void setYbLookupAmt(Long ybLookupAmt) {
        this.ybLookupAmt = ybLookupAmt;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId == null ? null : prescriptionId.trim();
    }

    public Date getPrescriptionDate() {
        return prescriptionDate;
    }

    public void setPrescriptionDate(Date prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
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

    public String getDepartCodeHb() {
        return departCodeHb;
    }

    public void setDepartCodeHb(String departCodeHb) {
        this.departCodeHb = departCodeHb == null ? null : departCodeHb.trim();
    }

    public String getDepartNameHb() {
        return departNameHb;
    }

    public void setDepartNameHb(String departNameHb) {
        this.departNameHb = departNameHb == null ? null : departNameHb.trim();
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

    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno == null ? null : docuno.trim();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode == null ? null : hospitalCode.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getReceiptno() {
        return receiptno;
    }

    public void setReceiptno(String receiptno) {
        this.receiptno = receiptno == null ? null : receiptno.trim();
    }
}