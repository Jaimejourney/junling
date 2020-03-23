package com.junling.mis.mapper;

import com.junling.mis.model.gradeLevelProductEntity;

public interface gradeLevelProductEntityMapper {
    int deleteByPrimaryKey(String gradeLevelProductId);

    int insert(gradeLevelProductEntity record);

    int insertSelective(gradeLevelProductEntity record);

    gradeLevelProductEntity selectByPrimaryKey(String gradeLevelProductId);

    int updateByPrimaryKeySelective(gradeLevelProductEntity record);

    int updateByPrimaryKeyWithBLOBs(gradeLevelProductEntity record);

    int updateByPrimaryKey(gradeLevelProductEntity record);
}