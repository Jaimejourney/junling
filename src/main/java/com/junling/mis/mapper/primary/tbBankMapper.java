package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbBank;

public interface tbBankMapper {
    int deleteByPrimaryKey(String bankCode);

    int insert(tbBank record);

    int insertSelective(tbBank record);

    tbBank selectByPrimaryKey(String bankCode);

    int updateByPrimaryKeySelective(tbBank record);

    int updateByPrimaryKey(tbBank record);
}