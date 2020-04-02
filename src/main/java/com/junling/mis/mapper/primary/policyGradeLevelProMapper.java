package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyGradeLevelPro;

public interface policyGradeLevelProMapper {
    int deleteByPrimaryKey(String pglProductId);

    int insert(policyGradeLevelPro record);

    int insertSelective(policyGradeLevelPro record);

    policyGradeLevelPro selectByPrimaryKey(String pglProductId);

    int updateByPrimaryKeySelective(policyGradeLevelPro record);

    int updateByPrimaryKey(policyGradeLevelPro record);
}