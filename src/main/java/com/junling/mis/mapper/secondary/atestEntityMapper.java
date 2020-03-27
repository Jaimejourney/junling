package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.atestEntity;

public interface atestEntityMapper {
    int insert(atestEntity record);

    int insertSelective(atestEntity record);
}