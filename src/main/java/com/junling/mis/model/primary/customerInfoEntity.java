package com.junling.mis.model.primary;

import java.math.BigDecimal;
import java.util.Date;

public class customerInfoEntity {
    private String customerNo;

    private String customerName;

    private String nickName;

    private String customerLevelCode;

    private BigDecimal customerScore;

    private String customerPhoneNo;

    private String birthDistrictCode;

    private String districtCode;

    private String idNo;

    private String idType;

    private String email;

    private String address;

    private Date birthday;

    private String gender;

    private String educationCode;

    private String educationSchool;

    private String married;

    private String beared;

    private String nameFamily;

    private String nation;

    private String jobTypeCode;

    private String resume;

    private BigDecimal salary;

    private String hasSocialSecurity;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo == null ? null : customerNo.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getCustomerLevelCode() {
        return customerLevelCode;
    }

    public void setCustomerLevelCode(String customerLevelCode) {
        this.customerLevelCode = customerLevelCode == null ? null : customerLevelCode.trim();
    }

    public BigDecimal getCustomerScore() {
        return customerScore;
    }

    public void setCustomerScore(BigDecimal customerScore) {
        this.customerScore = customerScore;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo == null ? null : customerPhoneNo.trim();
    }

    public String getBirthDistrictCode() {
        return birthDistrictCode;
    }

    public void setBirthDistrictCode(String birthDistrictCode) {
        this.birthDistrictCode = birthDistrictCode == null ? null : birthDistrictCode.trim();
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode == null ? null : districtCode.trim();
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEducationCode() {
        return educationCode;
    }

    public void setEducationCode(String educationCode) {
        this.educationCode = educationCode == null ? null : educationCode.trim();
    }

    public String getEducationSchool() {
        return educationSchool;
    }

    public void setEducationSchool(String educationSchool) {
        this.educationSchool = educationSchool == null ? null : educationSchool.trim();
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married == null ? null : married.trim();
    }

    public String getBeared() {
        return beared;
    }

    public void setBeared(String beared) {
        this.beared = beared == null ? null : beared.trim();
    }

    public String getNameFamily() {
        return nameFamily;
    }

    public void setNameFamily(String nameFamily) {
        this.nameFamily = nameFamily == null ? null : nameFamily.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getJobTypeCode() {
        return jobTypeCode;
    }

    public void setJobTypeCode(String jobTypeCode) {
        this.jobTypeCode = jobTypeCode == null ? null : jobTypeCode.trim();
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume == null ? null : resume.trim();
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getHasSocialSecurity() {
        return hasSocialSecurity;
    }

    public void setHasSocialSecurity(String hasSocialSecurity) {
        this.hasSocialSecurity = hasSocialSecurity == null ? null : hasSocialSecurity.trim();
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