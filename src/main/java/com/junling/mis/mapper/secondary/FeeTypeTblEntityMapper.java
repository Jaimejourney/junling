package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.FeeTypeTblEntity;

public interface FeeTypeTblEntityMapper {
    int deleteByPrimaryKey(String feeType);

    int insert(FeeTypeTblEntity record);

    int insertSelective(FeeTypeTblEntity record);

    FeeTypeTblEntity selectByPrimaryKey(String feeType);

    int updateByPrimaryKeySelective(FeeTypeTblEntity record);

    int updateByPrimaryKey(FeeTypeTblEntity record);
}