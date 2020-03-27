package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyInsuredEntity;

public interface policyInsuredEntityMapper {
    int deleteByPrimaryKey(String policyInsuredId);

    int insert(policyInsuredEntity record);

    int insertSelective(policyInsuredEntity record);

    policyInsuredEntity selectByPrimaryKey(String policyInsuredId);

    int updateByPrimaryKeySelective(policyInsuredEntity record);

    int updateByPrimaryKey(policyInsuredEntity record);
}