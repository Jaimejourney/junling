package com.junling.mis.mapper;

import com.junling.mis.model.drugsCopyEntity;

public interface drugsCopyEntityMapper {
    int insert(drugsCopyEntity record);

    int insertSelective(drugsCopyEntity record);
}