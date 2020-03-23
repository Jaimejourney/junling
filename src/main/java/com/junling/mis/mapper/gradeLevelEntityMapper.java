package com.junling.mis.mapper;

import com.junling.mis.model.gradeLevelEntity;

public interface gradeLevelEntityMapper {
    int deleteByPrimaryKey(String gradeLevelId);

    int insert(gradeLevelEntity record);

    int insertSelective(gradeLevelEntity record);

    gradeLevelEntity selectByPrimaryKey(String gradeLevelId);

    int updateByPrimaryKeySelective(gradeLevelEntity record);

    int updateByPrimaryKeyWithBLOBs(gradeLevelEntity record);

    int updateByPrimaryKey(gradeLevelEntity record);
}