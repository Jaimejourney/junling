package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.drugsEntity;

public interface drugsEntityMapper {
    int insert(drugsEntity record);

    int insertSelective(drugsEntity record);
}