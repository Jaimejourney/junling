package com.junling.mis.mapper;

import com.junling.mis.model.policyBeneficiaryEntity;

public interface policyBeneficiaryEntityMapper {
    int deleteByPrimaryKey(String policyBeneficiaryId);

    int insert(policyBeneficiaryEntity record);

    int insertSelective(policyBeneficiaryEntity record);

    policyBeneficiaryEntity selectByPrimaryKey(String policyBeneficiaryId);

    int updateByPrimaryKeySelective(policyBeneficiaryEntity record);

    int updateByPrimaryKey(policyBeneficiaryEntity record);
}