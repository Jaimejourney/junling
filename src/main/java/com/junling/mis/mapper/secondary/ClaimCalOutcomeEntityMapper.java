package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimCalOutcomeEntity;

public interface ClaimCalOutcomeEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClaimCalOutcomeEntity record);

    int insertSelective(ClaimCalOutcomeEntity record);

    ClaimCalOutcomeEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClaimCalOutcomeEntity record);

    int updateByPrimaryKey(ClaimCalOutcomeEntity record);
}