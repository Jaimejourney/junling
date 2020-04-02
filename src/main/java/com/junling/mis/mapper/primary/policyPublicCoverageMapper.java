package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyPublicCoverage;

public interface policyPublicCoverageMapper {
    int deleteByPrimaryKey(String policyPublicCoverageId);

    int insert(policyPublicCoverage record);

    int insertSelective(policyPublicCoverage record);

    policyPublicCoverage selectByPrimaryKey(String policyPublicCoverageId);

    int updateByPrimaryKeySelective(policyPublicCoverage record);

    int updateByPrimaryKey(policyPublicCoverage record);
}