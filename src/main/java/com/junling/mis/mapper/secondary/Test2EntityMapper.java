package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.Test2Entity;

public interface Test2EntityMapper {
    int insert(Test2Entity record);

    int insertSelective(Test2Entity record);
}