package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.SysExpenseEntity;

public interface SysExpenseEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysExpenseEntity record);

    int insertSelective(SysExpenseEntity record);

    SysExpenseEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysExpenseEntity record);

    int updateByPrimaryKey(SysExpenseEntity record);
}