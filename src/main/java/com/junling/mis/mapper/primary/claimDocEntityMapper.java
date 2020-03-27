package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.claimDocEntity;

public interface claimDocEntityMapper {
    int deleteByPrimaryKey(Integer docId);

    int insert(claimDocEntity record);

    int insertSelective(claimDocEntity record);

    claimDocEntity selectByPrimaryKey(Integer docId);

    int updateByPrimaryKeySelective(claimDocEntity record);

    int updateByPrimaryKey(claimDocEntity record);
}