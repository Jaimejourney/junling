package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.drugDataCopyEntity;

public interface drugDataCopyEntityMapper {
    int insert(drugDataCopyEntity record);

    int insertSelective(drugDataCopyEntity record);
}