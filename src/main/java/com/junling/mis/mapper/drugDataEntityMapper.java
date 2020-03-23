package com.junling.mis.mapper;

import com.junling.mis.model.drugDataEntity;

public interface drugDataEntityMapper {
    int insert(drugDataEntity record);

    int insertSelective(drugDataEntity record);
}