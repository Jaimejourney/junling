package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyBeneficiaryEntity;

public interface policyBeneficiaryEntityMapper {
    int deleteByPrimaryKey(String policyBeneficiaryId);

    int insert(policyBeneficiaryEntity record);

    int insertSelective(policyBeneficiaryEntity record);

    policyBeneficiaryEntity selectByPrimaryKey(String policyBeneficiaryId);

    int updateByPrimaryKeySelective(policyBeneficiaryEntity record);

    int updateByPrimaryKey(policyBeneficiaryEntity record);
}