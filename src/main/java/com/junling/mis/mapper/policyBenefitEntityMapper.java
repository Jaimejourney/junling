package com.junling.mis.mapper;

import com.junling.mis.model.policyBenefitEntity;

public interface policyBenefitEntityMapper {
    int deleteByPrimaryKey(String policyBenefitId);

    int insert(policyBenefitEntity record);

    int insertSelective(policyBenefitEntity record);

    policyBenefitEntity selectByPrimaryKey(String policyBenefitId);

    int updateByPrimaryKeySelective(policyBenefitEntity record);

    int updateByPrimaryKeyWithBLOBs(policyBenefitEntity record);

    int updateByPrimaryKey(policyBenefitEntity record);
}