package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimBillEntity;

public interface claimBillEntity1Mapper {
    int deleteByPrimaryKey(String seqno);

    int insert(claimBillEntity record);

    int insertSelective(claimBillEntity record);

    claimBillEntity selectByPrimaryKey(String seqno);

    int updateByPrimaryKeySelective(claimBillEntity record);

    int updateByPrimaryKey(claimBillEntity record);
}