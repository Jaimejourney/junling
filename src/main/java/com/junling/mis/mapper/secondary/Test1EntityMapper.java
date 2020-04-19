package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.Test1Entity;

public interface Test1EntityMapper {
    int insert(Test1Entity record);

    int insertSelective(Test1Entity record);
}