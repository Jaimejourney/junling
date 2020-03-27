package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbHospitalDepartmentEntity;

public interface tbHospitalDepartmentEntityMapper {
    int deleteByPrimaryKey(String hospitalDepartmentId);

    int insert(tbHospitalDepartmentEntity record);

    int insertSelective(tbHospitalDepartmentEntity record);

    tbHospitalDepartmentEntity selectByPrimaryKey(String hospitalDepartmentId);

    int updateByPrimaryKeySelective(tbHospitalDepartmentEntity record);

    int updateByPrimaryKey(tbHospitalDepartmentEntity record);
}