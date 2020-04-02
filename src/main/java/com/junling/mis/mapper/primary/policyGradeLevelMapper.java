package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyGradeLevel;

public interface policyGradeLevelMapper {
    int deleteByPrimaryKey(String policyGradeLevelId);

    int insert(policyGradeLevel record);

    int insertSelective(policyGradeLevel record);

    policyGradeLevel selectByPrimaryKey(String policyGradeLevelId);

    int updateByPrimaryKeySelective(policyGradeLevel record);

    int updateByPrimaryKey(policyGradeLevel record);
}