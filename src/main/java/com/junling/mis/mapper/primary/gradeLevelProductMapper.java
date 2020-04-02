package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.gradeLevelProduct;

public interface gradeLevelProductMapper {
    int deleteByPrimaryKey(String gradeLevelProductId);

    int insert(gradeLevelProduct record);

    int insertSelective(gradeLevelProduct record);

    gradeLevelProduct selectByPrimaryKey(String gradeLevelProductId);

    int updateByPrimaryKeySelective(gradeLevelProduct record);

    int updateByPrimaryKeyWithBLOBs(gradeLevelProduct record);

    int updateByPrimaryKey(gradeLevelProduct record);
}