package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.table1Entity;

public interface table1EntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(table1Entity record);

    int insertSelective(table1Entity record);

    table1Entity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(table1Entity record);

    int updateByPrimaryKey(table1Entity record);
}