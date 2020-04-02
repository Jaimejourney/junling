package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.claimWorkFlow;

public interface claimWorkFlowMapper {
    int deleteByPrimaryKey(String claimWorkFlowId);

    int insert(claimWorkFlow record);

    int insertSelective(claimWorkFlow record);

    claimWorkFlow selectByPrimaryKey(String claimWorkFlowId);

    int updateByPrimaryKeySelective(claimWorkFlow record);

    int updateByPrimaryKey(claimWorkFlow record);
}