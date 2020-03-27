package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.claimBillDetailEntity;
import com.junling.mis.model.primary.claimBillDetailEntityKey;

public interface claimBillDetailEntityMapper {
    int deleteByPrimaryKey(claimBillDetailEntityKey key);

    int insert(claimBillDetailEntity record);

    int insertSelective(claimBillDetailEntity record);

    claimBillDetailEntity selectByPrimaryKey(claimBillDetailEntityKey key);

    int updateByPrimaryKeySelective(claimBillDetailEntity record);

    int updateByPrimaryKey(claimBillDetailEntity record);
}