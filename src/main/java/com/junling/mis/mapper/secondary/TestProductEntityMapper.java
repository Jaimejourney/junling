package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.TestProductEntity;

public interface TestProductEntityMapper {
    int insert(TestProductEntity record);

    int insertSelective(TestProductEntity record);
}