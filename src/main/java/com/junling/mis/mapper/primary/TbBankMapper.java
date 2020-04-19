package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbBank;

public interface TbBankMapper {
    int deleteByPrimaryKey(String bankCode);

    int insert(TbBank record);

    int insertSelective(TbBank record);

    TbBank selectByPrimaryKey(String bankCode);

    int updateByPrimaryKeySelective(TbBank record);

    int updateByPrimaryKey(TbBank record);
}