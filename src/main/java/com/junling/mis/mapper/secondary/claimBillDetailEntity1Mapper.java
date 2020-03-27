package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimBillDetailEntity;

public interface claimBillDetailEntity1Mapper {
    int deleteByPrimaryKey(String id);

    int insert(claimBillDetailEntity record);

    int insertSelective(claimBillDetailEntity record);

    claimBillDetailEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(claimBillDetailEntity record);

    int updateByPrimaryKey(claimBillDetailEntity record);
}