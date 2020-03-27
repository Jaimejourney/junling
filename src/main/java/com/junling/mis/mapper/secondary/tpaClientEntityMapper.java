package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.tpaClientEntity;

public interface tpaClientEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(tpaClientEntity record);

    int insertSelective(tpaClientEntity record);

    tpaClientEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(tpaClientEntity record);

    int updateByPrimaryKey(tpaClientEntity record);
}