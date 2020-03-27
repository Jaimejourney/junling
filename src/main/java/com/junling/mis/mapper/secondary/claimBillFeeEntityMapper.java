package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimBillFeeEntity;

public interface claimBillFeeEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(claimBillFeeEntity record);

    int insertSelective(claimBillFeeEntity record);

    claimBillFeeEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(claimBillFeeEntity record);

    int updateByPrimaryKey(claimBillFeeEntity record);
}