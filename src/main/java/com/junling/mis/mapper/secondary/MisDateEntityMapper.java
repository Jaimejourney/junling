package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.MisDateEntity;

public interface MisDateEntityMapper {
    int insert(MisDateEntity record);

    int insertSelective(MisDateEntity record);
}