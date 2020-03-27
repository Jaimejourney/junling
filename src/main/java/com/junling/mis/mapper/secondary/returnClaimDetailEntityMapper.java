package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.returnClaimDetailEntity;

public interface returnClaimDetailEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(returnClaimDetailEntity record);

    int insertSelective(returnClaimDetailEntity record);

    returnClaimDetailEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(returnClaimDetailEntity record);

    int updateByPrimaryKey(returnClaimDetailEntity record);
}