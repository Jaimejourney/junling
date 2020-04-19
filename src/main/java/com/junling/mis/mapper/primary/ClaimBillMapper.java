package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.ClaimBill;
import com.junling.mis.model.primary.ClaimBillKey;

public interface ClaimBillMapper {
    int deleteByPrimaryKey(ClaimBillKey key);

    int insert(ClaimBill record);

    int insertSelective(ClaimBill record);

    ClaimBill selectByPrimaryKey(ClaimBillKey key);

    ClaimBill selectByClaimInfoId(String claimInfoId);

    int updateByPrimaryKeySelective(ClaimBill record);

    int updateByPrimaryKey(ClaimBill record);
}