package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimBenefitBillDetailEntity;

public interface claimBenefitBillDetailEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(claimBenefitBillDetailEntity record);

    int insertSelective(claimBenefitBillDetailEntity record);

    claimBenefitBillDetailEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(claimBenefitBillDetailEntity record);

    int updateByPrimaryKey(claimBenefitBillDetailEntity record);
}