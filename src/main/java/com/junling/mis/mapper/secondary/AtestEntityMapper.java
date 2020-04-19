package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.AtestEntity;

public interface AtestEntityMapper {
    int insert(AtestEntity record);

    int insertSelective(AtestEntity record);
}