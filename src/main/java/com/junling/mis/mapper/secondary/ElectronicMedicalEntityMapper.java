package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ElectronicMedicalEntity;
import com.junling.mis.model.secondary.ElectronicMedicalEntityWithBLOBs;

public interface ElectronicMedicalEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ElectronicMedicalEntityWithBLOBs record);

    int insertSelective(ElectronicMedicalEntityWithBLOBs record);

    ElectronicMedicalEntityWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ElectronicMedicalEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ElectronicMedicalEntityWithBLOBs record);

    int updateByPrimaryKey(ElectronicMedicalEntity record);
}