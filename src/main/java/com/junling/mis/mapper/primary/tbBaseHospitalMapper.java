package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbBaseHospital;

public interface tbBaseHospitalMapper {
    int deleteByPrimaryKey(String hospitalId);

    int insert(tbBaseHospital record);

    int insertSelective(tbBaseHospital record);

    tbBaseHospital selectByPrimaryKey(String hospitalId);

    int updateByPrimaryKeySelective(tbBaseHospital record);

    int updateByPrimaryKey(tbBaseHospital record);
}