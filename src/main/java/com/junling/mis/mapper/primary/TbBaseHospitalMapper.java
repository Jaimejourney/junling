package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbBaseHospital;

public interface TbBaseHospitalMapper {
    int deleteByPrimaryKey(String hospitalId);

    int insert(TbBaseHospital record);

    int insertSelective(TbBaseHospital record);

    TbBaseHospital selectByPrimaryKey(String hospitalId);

    int updateByPrimaryKeySelective(TbBaseHospital record);

    int updateByPrimaryKey(TbBaseHospital record);
}