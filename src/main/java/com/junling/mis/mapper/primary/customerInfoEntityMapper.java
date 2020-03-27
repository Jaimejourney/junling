package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.customerInfoEntity;

public interface customerInfoEntityMapper {
    int deleteByPrimaryKey(String customerNo);

    int insert(customerInfoEntity record);

    int insertSelective(customerInfoEntity record);

    customerInfoEntity selectByPrimaryKey(String customerNo);

    int updateByPrimaryKeySelective(customerInfoEntity record);

    int updateByPrimaryKey(customerInfoEntity record);
}