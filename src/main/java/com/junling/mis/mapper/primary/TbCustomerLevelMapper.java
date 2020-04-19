package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbCustomerLevel;

public interface TbCustomerLevelMapper {
    int deleteByPrimaryKey(String customerLevelCode);

    int insert(TbCustomerLevel record);

    int insertSelective(TbCustomerLevel record);

    TbCustomerLevel selectByPrimaryKey(String customerLevelCode);

    int updateByPrimaryKeySelective(TbCustomerLevel record);

    int updateByPrimaryKey(TbCustomerLevel record);
}