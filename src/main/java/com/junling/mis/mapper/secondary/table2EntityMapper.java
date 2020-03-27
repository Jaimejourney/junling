package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.table2Entity;

public interface table2EntityMapper {
    int insert(table2Entity record);

    int insertSelective(table2Entity record);
}