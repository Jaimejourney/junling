package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbHospitalDepartment;

public interface tbHospitalDepartmentMapper {
    int deleteByPrimaryKey(String hospitalDepartmentId);

    int insert(tbHospitalDepartment record);

    int insertSelective(tbHospitalDepartment record);

    tbHospitalDepartment selectByPrimaryKey(String hospitalDepartmentId);

    int updateByPrimaryKeySelective(tbHospitalDepartment record);

    int updateByPrimaryKey(tbHospitalDepartment record);
}