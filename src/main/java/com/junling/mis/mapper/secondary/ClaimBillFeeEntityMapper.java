package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimBillFeeEntity;

public interface ClaimBillFeeEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClaimBillFeeEntity record);

    int insertSelective(ClaimBillFeeEntity record);

    ClaimBillFeeEntity selectByPrimaryKey(Integer id);

    ClaimBillFeeEntity selectByDocuno(String docuno);

    int updateByPrimaryKeySelective(ClaimBillFeeEntity record);

    int updateByPrimaryKey(ClaimBillFeeEntity record);
}