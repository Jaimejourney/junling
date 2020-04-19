package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.CustomerBankInfo;

public interface CustomerBankInfoMapper {
    int deleteByPrimaryKey(String accountId);

    int insert(CustomerBankInfo record);

    int insertSelective(CustomerBankInfo record);

    CustomerBankInfo selectByPrimaryKey(String accountId);


    int updateByPrimaryKeySelective(CustomerBankInfo record);

    int updateByPrimaryKey(CustomerBankInfo record);
}