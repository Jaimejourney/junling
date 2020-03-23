package com.junling.mis.mapper;

import com.junling.mis.model.drugsEntity;

public interface drugsEntityMapper {
    int insert(drugsEntity record);

    int insertSelective(drugsEntity record);
}