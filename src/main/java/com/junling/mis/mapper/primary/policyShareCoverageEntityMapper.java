package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyShareCoverageEntity;
import com.junling.mis.model.primary.policyShareCoverageEntityKey;

public interface policyShareCoverageEntityMapper {
    int deleteByPrimaryKey(policyShareCoverageEntityKey key);

    int insert(policyShareCoverageEntity record);

    int insertSelective(policyShareCoverageEntity record);

    policyShareCoverageEntity selectByPrimaryKey(policyShareCoverageEntityKey key);

    int updateByPrimaryKeySelective(policyShareCoverageEntity record);

    int updateByPrimaryKey(policyShareCoverageEntity record);
}