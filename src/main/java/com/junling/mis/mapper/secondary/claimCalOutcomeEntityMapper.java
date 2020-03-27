package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimCalOutcomeEntity;

public interface claimCalOutcomeEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(claimCalOutcomeEntity record);

    int insertSelective(claimCalOutcomeEntity record);

    claimCalOutcomeEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(claimCalOutcomeEntity record);

    int updateByPrimaryKey(claimCalOutcomeEntity record);
}