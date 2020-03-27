package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimLiabCalEntity;

public interface claimLiabCalEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(claimLiabCalEntity record);

    int insertSelective(claimLiabCalEntity record);

    claimLiabCalEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(claimLiabCalEntity record);

    int updateByPrimaryKey(claimLiabCalEntity record);
}