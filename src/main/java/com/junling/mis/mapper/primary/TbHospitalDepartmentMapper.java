package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbHospitalDepartment;

public interface TbHospitalDepartmentMapper {
    int deleteByPrimaryKey(String hospitalDepartmentId);

    int insert(TbHospitalDepartment record);

    int insertSelective(TbHospitalDepartment record);

    TbHospitalDepartment selectByPrimaryKey(String hospitalDepartmentId);

    int updateByPrimaryKeySelective(TbHospitalDepartment record);

    int updateByPrimaryKey(TbHospitalDepartment record);
}