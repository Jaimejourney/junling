package com.junling.mis.mapper;

import com.junling.mis.model.claimBillEntity;
import com.junling.mis.model.claimBillEntityKey;

public interface claimBillEntityMapper {
    int deleteByPrimaryKey(claimBillEntityKey key);

    int insert(claimBillEntity record);

    int insertSelective(claimBillEntity record);

    claimBillEntity selectByPrimaryKey(claimBillEntityKey key);

    int updateByPrimaryKeySelective(claimBillEntity record);

    int updateByPrimaryKey(claimBillEntity record);
}