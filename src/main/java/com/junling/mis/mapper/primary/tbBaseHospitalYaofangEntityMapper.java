package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbBaseHospitalYaofangEntity;
import com.junling.mis.model.primary.tbBaseHospitalYaofangEntityWithBLOBs;

public interface tbBaseHospitalYaofangEntityMapper {
    int deleteByPrimaryKey(String hospitalId);

    int insert(tbBaseHospitalYaofangEntityWithBLOBs record);

    int insertSelective(tbBaseHospitalYaofangEntityWithBLOBs record);

    tbBaseHospitalYaofangEntityWithBLOBs selectByPrimaryKey(String hospitalId);

    int updateByPrimaryKeySelective(tbBaseHospitalYaofangEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(tbBaseHospitalYaofangEntityWithBLOBs record);

    int updateByPrimaryKey(tbBaseHospitalYaofangEntity record);
}