package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.electronicMedicalEntity;
import com.junling.mis.model.secondary.electronicMedicalEntityWithBLOBs;

public interface electronicMedicalEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(electronicMedicalEntityWithBLOBs record);

    int insertSelective(electronicMedicalEntityWithBLOBs record);

    electronicMedicalEntityWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(electronicMedicalEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(electronicMedicalEntityWithBLOBs record);

    int updateByPrimaryKey(electronicMedicalEntity record);
}