package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ReturnClaimDetailEntity;

public interface ReturnClaimDetailEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReturnClaimDetailEntity record);

    int insertSelective(ReturnClaimDetailEntity record);

    ReturnClaimDetailEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReturnClaimDetailEntity record);

    int updateByPrimaryKey(ReturnClaimDetailEntity record);
}