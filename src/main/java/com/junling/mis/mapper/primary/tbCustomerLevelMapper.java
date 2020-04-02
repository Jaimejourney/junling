package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbCustomerLevel;

public interface tbCustomerLevelMapper {
    int deleteByPrimaryKey(String customerLevelCode);

    int insert(tbCustomerLevel record);

    int insertSelective(tbCustomerLevel record);

    tbCustomerLevel selectByPrimaryKey(String customerLevelCode);

    int updateByPrimaryKeySelective(tbCustomerLevel record);

    int updateByPrimaryKey(tbCustomerLevel record);
}