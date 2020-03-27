package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.test1Entity;

public interface test1EntityMapper {
    int insert(test1Entity record);

    int insertSelective(test1Entity record);
}