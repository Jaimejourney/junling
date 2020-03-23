package com.junling.mis.mapper;

import com.junling.mis.model.claimBillDetailEntity;
import com.junling.mis.model.claimBillDetailEntityKey;

public interface claimBillDetailEntityMapper {
    int deleteByPrimaryKey(claimBillDetailEntityKey key);

    int insert(claimBillDetailEntity record);

    int insertSelective(claimBillDetailEntity record);

    claimBillDetailEntity selectByPrimaryKey(claimBillDetailEntityKey key);

    int updateByPrimaryKeySelective(claimBillDetailEntity record);

    int updateByPrimaryKey(claimBillDetailEntity record);
}