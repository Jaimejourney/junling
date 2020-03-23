package com.junling.mis.mapper;

import com.junling.mis.model.policyInsuredServiceEntity;

public interface policyInsuredServiceEntityMapper {
    int deleteByPrimaryKey(String policyInsuredServiceId);

    int insert(policyInsuredServiceEntity record);

    int insertSelective(policyInsuredServiceEntity record);

    policyInsuredServiceEntity selectByPrimaryKey(String policyInsuredServiceId);

    int updateByPrimaryKeySelective(policyInsuredServiceEntity record);

    int updateByPrimaryKey(policyInsuredServiceEntity record);
}