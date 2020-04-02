package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.claimBillDetail;
import com.junling.mis.model.primary.claimBillDetailKey;

public interface claimBillDetailMapper {
    int deleteByPrimaryKey(claimBillDetailKey key);

    int insert(claimBillDetail record);

    int insertSelective(claimBillDetail record);

    claimBillDetail selectByPrimaryKey(claimBillDetailKey key);

    int updateByPrimaryKeySelective(claimBillDetail record);

    int updateByPrimaryKey(claimBillDetail record);
}