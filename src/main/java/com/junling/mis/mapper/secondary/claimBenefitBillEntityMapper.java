package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimBenefitBillEntity;

public interface claimBenefitBillEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(claimBenefitBillEntity record);

    int insertSelective(claimBenefitBillEntity record);

    claimBenefitBillEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(claimBenefitBillEntity record);

    int updateByPrimaryKey(claimBenefitBillEntity record);
}