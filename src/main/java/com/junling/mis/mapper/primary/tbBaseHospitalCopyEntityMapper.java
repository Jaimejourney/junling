package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbBaseHospitalCopyEntity;

public interface tbBaseHospitalCopyEntityMapper {
    int deleteByPrimaryKey(Integer hospitalId);

    int insert(tbBaseHospitalCopyEntity record);

    int insertSelective(tbBaseHospitalCopyEntity record);

    tbBaseHospitalCopyEntity selectByPrimaryKey(Integer hospitalId);

    int updateByPrimaryKeySelective(tbBaseHospitalCopyEntity record);

    int updateByPrimaryKey(tbBaseHospitalCopyEntity record);
}