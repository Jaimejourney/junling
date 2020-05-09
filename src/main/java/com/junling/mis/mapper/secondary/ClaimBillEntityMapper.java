package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimBillEntity;

import java.util.List;

public interface ClaimBillEntityMapper {
    int deleteByPrimaryKey(String seqno);

    int insert(ClaimBillEntity record);

    int insertSelective(ClaimBillEntity record);

    ClaimBillEntity selectByPrimaryKey(String seqno);

    List<ClaimBillEntity> selectByDocuno(String docuno);

    int updateByPrimaryKeySelective(ClaimBillEntity record);

    int updateByPrimaryKey(ClaimBillEntity record);
}