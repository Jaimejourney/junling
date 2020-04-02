package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.claimBill;
import com.junling.mis.model.primary.claimBillKey;

public interface claimBillMapper {
    int deleteByPrimaryKey(claimBillKey key);

    int insert(claimBill record);

    int insertSelective(claimBill record);

    claimBill selectByPrimaryKey(claimBillKey key);

    int updateByPrimaryKeySelective(claimBill record);

    int updateByPrimaryKey(claimBill record);
}