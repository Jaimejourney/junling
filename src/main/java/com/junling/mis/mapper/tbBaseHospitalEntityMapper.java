package com.junling.mis.mapper;

import com.junling.mis.model.tbBaseHospitalEntity;
import com.junling.mis.model.tbBaseHospitalEntityWithBLOBs;

public interface tbBaseHospitalEntityMapper {
    int deleteByPrimaryKey(String hospitalId);

    int insert(tbBaseHospitalEntityWithBLOBs record);

    int insertSelective(tbBaseHospitalEntityWithBLOBs record);

    tbBaseHospitalEntityWithBLOBs selectByPrimaryKey(String hospitalId);

    int updateByPrimaryKeySelective(tbBaseHospitalEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(tbBaseHospitalEntityWithBLOBs record);

    int updateByPrimaryKey(tbBaseHospitalEntity record);
}