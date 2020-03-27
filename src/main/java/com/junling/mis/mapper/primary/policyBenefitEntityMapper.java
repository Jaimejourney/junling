package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyBenefitEntity;

public interface policyBenefitEntityMapper {
    int deleteByPrimaryKey(String policyBenefitId);

    int insert(policyBenefitEntity record);

    int insertSelective(policyBenefitEntity record);

    policyBenefitEntity selectByPrimaryKey(String policyBenefitId);

    int updateByPrimaryKeySelective(policyBenefitEntity record);

    int updateByPrimaryKeyWithBLOBs(policyBenefitEntity record);

    int updateByPrimaryKey(policyBenefitEntity record);
}