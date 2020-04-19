package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.PolicyShareCoverage;
import com.junling.mis.model.primary.PolicyShareCoverageKey;

public interface PolicyShareCoverageMapper {
    int deleteByPrimaryKey(PolicyShareCoverageKey key);

    int insert(PolicyShareCoverage record);

    int insertSelective(PolicyShareCoverage record);

    PolicyShareCoverage selectByPrimaryKey(PolicyShareCoverageKey key);

    int updateByPrimaryKeySelective(PolicyShareCoverage record);

    int updateByPrimaryKey(PolicyShareCoverage record);
}