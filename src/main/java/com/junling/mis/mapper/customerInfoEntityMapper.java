package com.junling.mis.mapper;

import com.junling.mis.model.customerInfoEntity;

public interface customerInfoEntityMapper {
    int deleteByPrimaryKey(String customerNo);

    int insert(customerInfoEntity record);

    int insertSelective(customerInfoEntity record);

    customerInfoEntity selectByPrimaryKey(String customerNo);

    int updateByPrimaryKeySelective(customerInfoEntity record);

    int updateByPrimaryKey(customerInfoEntity record);
}