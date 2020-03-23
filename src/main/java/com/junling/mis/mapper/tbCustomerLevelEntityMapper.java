package com.junling.mis.mapper;

import com.junling.mis.model.tbCustomerLevelEntity;

public interface tbCustomerLevelEntityMapper {
    int deleteByPrimaryKey(String customerLevelCode);

    int insert(tbCustomerLevelEntity record);

    int insertSelective(tbCustomerLevelEntity record);

    tbCustomerLevelEntity selectByPrimaryKey(String customerLevelCode);

    int updateByPrimaryKeySelective(tbCustomerLevelEntity record);

    int updateByPrimaryKey(tbCustomerLevelEntity record);
}