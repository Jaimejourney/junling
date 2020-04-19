package com.junling.mis.model.secondary;

import java.util.Date;

public class TpaClientEntity {
    private Long id;

    private String gradeLevel;

    private String clientno;

    private String idType;

    private String idno;

    private String name;

    private String gender;

    private String address;

    private Date birthDate;

    private String mobile;

    private String email;

    private String surrenderInsEffDate;

    private String socialSecFlag;

    private String createdBy;

    private Date createdDate;

    private String updatedBy;

    private Date updatedDate;

    private String mainInsuredId;

    private String mainIdType;

    private String mainIdno;

    private String mainName;

    private String mainGender;

    private String mainBirthDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel == null ? null : gradeLevel.trim();
    }

    public String getClientno() {
        return clientno;
    }

    public void setClientno(String clientno) {
        this.clientno = clientno == null ? null : clientno.trim();
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSurrenderInsEffDate() {
        return surrenderInsEffDate;
    }

    public void setSurrenderInsEffDate(String surrenderInsEffDate) {
        this.surrenderInsEffDate = surrenderInsEffDate == null ? null : surrenderInsEffDate.trim();
    }

    public String getSocialSecFlag() {
        return socialSecFlag;
    }

    public void setSocialSecFlag(String socialSecFlag) {
        this.socialSecFlag = socialSecFlag == null ? null : socialSecFlag.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getMainInsuredId() {
        return mainInsuredId;
    }

    public void setMainInsuredId(String mainInsuredId) {
        this.mainInsuredId = mainInsuredId == null ? null : mainInsuredId.trim();
    }

    public String getMainIdType() {
        return mainIdType;
    }

    public void setMainIdType(String mainIdType) {
        this.mainIdType = mainIdType == null ? null : mainIdType.trim();
    }

    public String getMainIdno() {
        return mainIdno;
    }

    public void setMainIdno(String mainIdno) {
        this.mainIdno = mainIdno == null ? null : mainIdno.trim();
    }

    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName == null ? null : mainName.trim();
    }

    public String getMainGender() {
        return mainGender;
    }

    public void setMainGender(String mainGender) {
        this.mainGender = mainGender == null ? null : mainGender.trim();
    }

    public String getMainBirthDate() {
        return mainBirthDate;
    }

    public void setMainBirthDate(String mainBirthDate) {
        this.mainBirthDate = mainBirthDate == null ? null : mainBirthDate.trim();
    }
}