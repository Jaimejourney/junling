package com.junling.mis.mapper;

import com.junling.mis.model.claimWorkFlowEntity;

public interface claimWorkFlowEntityMapper {
    int deleteByPrimaryKey(String claimWorkFlowId);

    int insert(claimWorkFlowEntity record);

    int insertSelective(claimWorkFlowEntity record);

    claimWorkFlowEntity selectByPrimaryKey(String claimWorkFlowId);

    int updateByPrimaryKeySelective(claimWorkFlowEntity record);

    int updateByPrimaryKey(claimWorkFlowEntity record);
}