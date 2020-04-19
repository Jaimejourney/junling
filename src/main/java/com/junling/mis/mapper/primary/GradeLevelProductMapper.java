package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.GradeLevelProduct;

public interface GradeLevelProductMapper {
    int deleteByPrimaryKey(String gradeLevelProductId);

    int insert(GradeLevelProduct record);

    int insertSelective(GradeLevelProduct record);

    GradeLevelProduct selectByPrimaryKey(String gradeLevelProductId);

    int updateByPrimaryKeySelective(GradeLevelProduct record);

    int updateByPrimaryKeyWithBLOBs(GradeLevelProduct record);

    int updateByPrimaryKey(GradeLevelProduct record);
}