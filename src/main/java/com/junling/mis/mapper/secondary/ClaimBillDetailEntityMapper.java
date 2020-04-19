package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimBillDetailEntity;

public interface ClaimBillDetailEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClaimBillDetailEntity record);

    int insertSelective(ClaimBillDetailEntity record);

    ClaimBillDetailEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClaimBillDetailEntity record);

    int updateByPrimaryKey(ClaimBillDetailEntity record);
}