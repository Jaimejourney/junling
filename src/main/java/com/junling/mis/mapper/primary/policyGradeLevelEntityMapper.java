package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyGradeLevelEntity;

public interface policyGradeLevelEntityMapper {
    int deleteByPrimaryKey(String policyGradeLevelId);

    int insert(policyGradeLevelEntity record);

    int insertSelective(policyGradeLevelEntity record);

    policyGradeLevelEntity selectByPrimaryKey(String policyGradeLevelId);

    int updateByPrimaryKeySelective(policyGradeLevelEntity record);

    int updateByPrimaryKey(policyGradeLevelEntity record);
}