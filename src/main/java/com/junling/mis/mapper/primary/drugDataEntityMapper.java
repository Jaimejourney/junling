package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.drugDataEntity;

public interface drugDataEntityMapper {
    int insert(drugDataEntity record);

    int insertSelective(drugDataEntity record);
}