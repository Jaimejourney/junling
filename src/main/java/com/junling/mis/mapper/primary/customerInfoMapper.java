package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.customerInfo;

public interface customerInfoMapper {
    int deleteByPrimaryKey(String customerNo);

    int insert(customerInfo record);

    int insertSelective(customerInfo record);

    customerInfo selectByPrimaryKey(String customerNo);

    int updateByPrimaryKeySelective(customerInfo record);

    int updateByPrimaryKey(customerInfo record);
}