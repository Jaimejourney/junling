package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimBillOperationEntity;

public interface ClaimBillOperationEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClaimBillOperationEntity record);

    int insertSelective(ClaimBillOperationEntity record);

    ClaimBillOperationEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClaimBillOperationEntity record);

    int updateByPrimaryKey(ClaimBillOperationEntity record);
}