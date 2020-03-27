package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.gradeLevelProductEntity;

public interface gradeLevelProductEntityMapper {
    int deleteByPrimaryKey(String gradeLevelProductId);

    int insert(gradeLevelProductEntity record);

    int insertSelective(gradeLevelProductEntity record);

    gradeLevelProductEntity selectByPrimaryKey(String gradeLevelProductId);

    int updateByPrimaryKeySelective(gradeLevelProductEntity record);

    int updateByPrimaryKeyWithBLOBs(gradeLevelProductEntity record);

    int updateByPrimaryKey(gradeLevelProductEntity record);
}