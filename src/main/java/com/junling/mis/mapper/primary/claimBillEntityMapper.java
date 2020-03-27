package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.claimBillEntity;
import com.junling.mis.model.primary.claimBillEntityKey;

public interface claimBillEntityMapper {
    int deleteByPrimaryKey(claimBillEntityKey key);

    int insert(claimBillEntity record);

    int insertSelective(claimBillEntity record);

    claimBillEntity selectByPrimaryKey(claimBillEntityKey key);

    int updateByPrimaryKeySelective(claimBillEntity record);

    int updateByPrimaryKey(claimBillEntity record);
}