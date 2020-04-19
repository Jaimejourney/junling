package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.ClaimWorkFlow;

public interface ClaimWorkFlowMapper {
    int deleteByPrimaryKey(String claimWorkFlowId);

    int insert(ClaimWorkFlow record);

    int insertSelective(ClaimWorkFlow record);

    ClaimWorkFlow selectByPrimaryKey(String claimWorkFlowId);

    int updateByPrimaryKeySelective(ClaimWorkFlow record);

    int updateByPrimaryKey(ClaimWorkFlow record);
}