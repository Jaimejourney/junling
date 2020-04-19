package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.Table2Entity;

public interface Table2EntityMapper {
    int insert(Table2Entity record);

    int insertSelective(Table2Entity record);
}