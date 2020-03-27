package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimBillOperationEntity;

public interface claimBillOperationEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(claimBillOperationEntity record);

    int insertSelective(claimBillOperationEntity record);

    claimBillOperationEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(claimBillOperationEntity record);

    int updateByPrimaryKey(claimBillOperationEntity record);
}