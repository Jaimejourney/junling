package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.sysExpenseEntity;

public interface sysExpenseEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysExpenseEntity record);

    int insertSelective(sysExpenseEntity record);

    sysExpenseEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sysExpenseEntity record);

    int updateByPrimaryKey(sysExpenseEntity record);
}