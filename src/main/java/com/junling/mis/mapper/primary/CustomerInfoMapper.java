package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.CustomerInfo;

public interface CustomerInfoMapper {
    int deleteByPrimaryKey(String customerNo);

    int insert(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    CustomerInfo selectByPrimaryKey(String customerNo);

    CustomerInfo selectByIdNo(String idNo);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);
}