package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.testProductEntity;

public interface testProductEntityMapper {
    int insert(testProductEntity record);

    int insertSelective(testProductEntity record);
}