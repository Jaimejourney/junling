package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.itemHospitalRelationEntity;

public interface itemHospitalRelationEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(itemHospitalRelationEntity record);

    int insertSelective(itemHospitalRelationEntity record);

    itemHospitalRelationEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(itemHospitalRelationEntity record);

    int updateByPrimaryKey(itemHospitalRelationEntity record);
}