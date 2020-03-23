package com.junling.mis.mapper;

import com.junling.mis.model.policyPublicCoverageEntity;

public interface policyPublicCoverageEntityMapper {
    int deleteByPrimaryKey(String policyPublicCoverageId);

    int insert(policyPublicCoverageEntity record);

    int insertSelective(policyPublicCoverageEntity record);

    policyPublicCoverageEntity selectByPrimaryKey(String policyPublicCoverageId);

    int updateByPrimaryKeySelective(policyPublicCoverageEntity record);

    int updateByPrimaryKey(policyPublicCoverageEntity record);
}