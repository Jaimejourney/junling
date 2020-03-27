package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.drugsCopyEntity;

public interface drugsCopyEntityMapper {
    int insert(drugsCopyEntity record);

    int insertSelective(drugsCopyEntity record);
}