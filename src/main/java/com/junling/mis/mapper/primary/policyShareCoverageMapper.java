package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyShareCoverage;
import com.junling.mis.model.primary.policyShareCoverageKey;

public interface policyShareCoverageMapper {
    int deleteByPrimaryKey(policyShareCoverageKey key);

    int insert(policyShareCoverage record);

    int insertSelective(policyShareCoverage record);

    policyShareCoverage selectByPrimaryKey(policyShareCoverageKey key);

    int updateByPrimaryKeySelective(policyShareCoverage record);

    int updateByPrimaryKey(policyShareCoverage record);
}