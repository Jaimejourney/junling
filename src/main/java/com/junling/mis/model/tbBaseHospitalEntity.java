package com.junling.mis.model;

import java.util.Date;

public class tbBaseHospitalEntity {
    private String hospitalId;

    private String provinceOrState;

    private String cityOrDistrict;

    private String countyOrDistrict;

    private String districtCode;

    private String hospitalName;

    private String anotherName;

    private String address;

    private String nature;

    private String grade;

    private String contactNumber;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId == null ? null : hospitalId.trim();
    }

    public String getProvinceOrState() {
        return provinceOrState;
    }

    public void setProvinceOrState(String provinceOrState) {
        this.provinceOrState = provinceOrState == null ? null : provinceOrState.trim();
    }

    public String getCityOrDistrict() {
        return cityOrDistrict;
    }

    public void setCityOrDistrict(String cityOrDistrict) {
        this.cityOrDistrict = cityOrDistrict == null ? null : cityOrDistrict.trim();
    }

    public String getCountyOrDistrict() {
        return countyOrDistrict;
    }

    public void setCountyOrDistrict(String countyOrDistrict) {
        this.countyOrDistrict = countyOrDistrict == null ? null : countyOrDistrict.trim();
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode == null ? null : districtCode.trim();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getAnotherName() {
        return anotherName;
    }

    public void setAnotherName(String anotherName) {
        this.anotherName = anotherName == null ? null : anotherName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature == null ? null : nature.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
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