package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.misDateEntity;

public interface misDateEntityMapper {
    int insert(misDateEntity record);

    int insertSelective(misDateEntity record);
}