package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.ClaimBillDetail;
import com.junling.mis.model.primary.ClaimBillDetailKey;

public interface ClaimBillDetailMapper {
    int deleteByPrimaryKey(ClaimBillDetailKey key);

    int insert(ClaimBillDetail record);

    int insertSelective(ClaimBillDetail record);

    ClaimBillDetail selectByPrimaryKey(ClaimBillDetailKey key);

    int updateByPrimaryKeySelective(ClaimBillDetail record);

    int updateByPrimaryKey(ClaimBillDetail record);
}