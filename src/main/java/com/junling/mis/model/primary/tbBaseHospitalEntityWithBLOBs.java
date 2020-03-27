package com.junling.mis.model.primary;

public class tbBaseHospitalEntityWithBLOBs extends tbBaseHospitalEntity {
    private String remark;

    private String department;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }
}