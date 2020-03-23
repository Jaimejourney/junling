package com.junling.mis.mapper;

import com.junling.mis.model.tbDepartmentHospitalEntity;

public interface tbDepartmentHospitalEntityMapper {
    int deleteByPrimaryKey(Integer departmentId);

    int insert(tbDepartmentHospitalEntity record);

    int insertSelective(tbDepartmentHospitalEntity record);

    tbDepartmentHospitalEntity selectByPrimaryKey(Integer departmentId);

    int updateByPrimaryKeySelective(tbDepartmentHospitalEntity record);

    int updateByPrimaryKey(tbDepartmentHospitalEntity record);
}