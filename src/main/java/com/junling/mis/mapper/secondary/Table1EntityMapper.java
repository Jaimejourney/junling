package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.Table1Entity;

public interface Table1EntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(Table1Entity record);

    int insertSelective(Table1Entity record);

    Table1Entity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Table1Entity record);

    int updateByPrimaryKey(Table1Entity record);
}