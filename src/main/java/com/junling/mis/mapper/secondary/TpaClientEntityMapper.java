package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.TpaClientEntity;

public interface TpaClientEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TpaClientEntity record);

    int insertSelective(TpaClientEntity record);

    TpaClientEntity selectByPrimaryKey(Long id);

    TpaClientEntity selectByMainInsuredId(String mainInsuredId);

    int updateByPrimaryKeySelective(TpaClientEntity record);

    int updateByPrimaryKey(TpaClientEntity record);
}