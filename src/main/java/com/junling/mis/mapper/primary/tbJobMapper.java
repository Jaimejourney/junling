package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbJob;

public interface tbJobMapper {
    int deleteByPrimaryKey(String jobCode);

    int insert(tbJob record);

    int insertSelective(tbJob record);

    tbJob selectByPrimaryKey(String jobCode);

    int updateByPrimaryKeySelective(tbJob record);

    int updateByPrimaryKey(tbJob record);
}