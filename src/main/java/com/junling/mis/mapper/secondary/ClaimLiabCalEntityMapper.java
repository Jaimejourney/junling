package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimLiabCalEntity;

public interface ClaimLiabCalEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClaimLiabCalEntity record);

    int insertSelective(ClaimLiabCalEntity record);

    ClaimLiabCalEntity selectByPrimaryKey(String id);

    ClaimLiabCalEntity selectByDocuno(String docuno);

    int updateByPrimaryKeySelective(ClaimLiabCalEntity record);

    int updateByPrimaryKey(ClaimLiabCalEntity record);
}