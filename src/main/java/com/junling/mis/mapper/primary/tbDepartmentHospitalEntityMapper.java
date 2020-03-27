package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbDepartmentHospitalEntity;

public interface tbDepartmentHospitalEntityMapper {
    int deleteByPrimaryKey(Integer departmentId);

    int insert(tbDepartmentHospitalEntity record);

    int insertSelective(tbDepartmentHospitalEntity record);

    tbDepartmentHospitalEntity selectByPrimaryKey(Integer departmentId);

    int updateByPrimaryKeySelective(tbDepartmentHospitalEntity record);

    int updateByPrimaryKey(tbDepartmentHospitalEntity record);
}