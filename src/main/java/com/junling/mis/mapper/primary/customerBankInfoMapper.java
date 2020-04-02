package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.customerBankInfo;

public interface customerBankInfoMapper {
    int deleteByPrimaryKey(String accountId);

    int insert(customerBankInfo record);

    int insertSelective(customerBankInfo record);

    customerBankInfo selectByPrimaryKey(String accountId);

    int updateByPrimaryKeySelective(customerBankInfo record);

    int updateByPrimaryKey(customerBankInfo record);
}