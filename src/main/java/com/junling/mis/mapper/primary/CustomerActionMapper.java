package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.CustomerAction;

public interface CustomerActionMapper {
    int deleteByPrimaryKey(String customerActionId);

    int insert(CustomerAction record);

    int insertSelective(CustomerAction record);

    CustomerAction selectByPrimaryKey(String customerActionId);

    CustomerAction selectByCustomerId(String customerId);

    int updateByPrimaryKeySelective(CustomerAction record);

    int updateByPrimaryKey(CustomerAction record);
}