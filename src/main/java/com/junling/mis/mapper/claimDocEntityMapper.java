package com.junling.mis.mapper;

import com.junling.mis.model.claimDocEntity;

public interface claimDocEntityMapper {
    int deleteByPrimaryKey(Integer docId);

    int insert(claimDocEntity record);

    int insertSelective(claimDocEntity record);

    claimDocEntity selectByPrimaryKey(Integer docId);

    int updateByPrimaryKeySelective(claimDocEntity record);

    int updateByPrimaryKey(claimDocEntity record);
}