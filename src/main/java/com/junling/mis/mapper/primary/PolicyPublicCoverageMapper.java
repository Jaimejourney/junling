package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.PolicyPublicCoverage;

public interface PolicyPublicCoverageMapper {
    int deleteByPrimaryKey(String policyPublicCoverageId);

    int insert(PolicyPublicCoverage record);

    int insertSelective(PolicyPublicCoverage record);

    PolicyPublicCoverage selectByPrimaryKey(String policyPublicCoverageId);

    int updateByPrimaryKeySelective(PolicyPublicCoverage record);

    int updateByPrimaryKey(PolicyPublicCoverage record);
}