package com.junling.mis.mapper;

import com.junling.mis.model.tbBankEntity;

public interface tbBankEntityMapper {
    int deleteByPrimaryKey(String bankCode);

    int insert(tbBankEntity record);

    int insertSelective(tbBankEntity record);

    tbBankEntity selectByPrimaryKey(String bankCode);

    int updateByPrimaryKeySelective(tbBankEntity record);

    int updateByPrimaryKey(tbBankEntity record);
}