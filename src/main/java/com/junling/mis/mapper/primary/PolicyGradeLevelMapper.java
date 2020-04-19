package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.PolicyGradeLevel;

public interface PolicyGradeLevelMapper {
    int deleteByPrimaryKey(String policyGradeLevelId);

    int insert(PolicyGradeLevel record);

    int insertSelective(PolicyGradeLevel record);

    PolicyGradeLevel selectByPrimaryKey(String policyGradeLevelId);

    PolicyGradeLevel selectByPrimaryKey(String policyGradeLevelId);

    int updateByPrimaryKeySelective(PolicyGradeLevel record);

    int updateByPrimaryKey(PolicyGradeLevel record);
}