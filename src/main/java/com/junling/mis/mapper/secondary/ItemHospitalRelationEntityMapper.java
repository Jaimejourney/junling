package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ItemHospitalRelationEntity;

public interface ItemHospitalRelationEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ItemHospitalRelationEntity record);

    int insertSelective(ItemHospitalRelationEntity record);

    ItemHospitalRelationEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ItemHospitalRelationEntity record);

    int updateByPrimaryKey(ItemHospitalRelationEntity record);
}