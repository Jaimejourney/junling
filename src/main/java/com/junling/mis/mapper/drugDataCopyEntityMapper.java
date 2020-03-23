package com.junling.mis.mapper;

import com.junling.mis.model.drugDataCopyEntity;

public interface drugDataCopyEntityMapper {
    int insert(drugDataCopyEntity record);

    int insertSelective(drugDataCopyEntity record);
}