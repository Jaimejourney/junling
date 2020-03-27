package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.feeTypeTblEntity;

public interface feeTypeTblEntityMapper {
    int deleteByPrimaryKey(String feeType);

    int insert(feeTypeTblEntity record);

    int insertSelective(feeTypeTblEntity record);

    feeTypeTblEntity selectByPrimaryKey(String feeType);

    int updateByPrimaryKeySelective(feeTypeTblEntity record);

    int updateByPrimaryKey(feeTypeTblEntity record);
}