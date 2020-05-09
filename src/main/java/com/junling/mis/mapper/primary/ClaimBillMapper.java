package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.ClaimBill;
import com.junling.mis.model.primary.ClaimBillKey;

import java.util.List;

public interface ClaimBillMapper {
    int deleteByPrimaryKey(ClaimBillKey key);

    int insert(ClaimBill record);

    int insertSelective(ClaimBill record);

    ClaimBill selectByPrimaryKey(ClaimBillKey key);

    List<ClaimBill> selectByClaimInfoId(String claimInfoId);

    ClaimBill selectByClaimBillId(String claimBillId);

    int updateByPrimaryKeySelective(ClaimBill record);

    int updateByPrimaryKey(ClaimBill record);
}