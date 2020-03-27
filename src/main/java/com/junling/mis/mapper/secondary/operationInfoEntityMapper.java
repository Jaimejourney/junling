package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.operationInfoEntity;

public interface operationInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(operationInfoEntity record);

    int insertSelective(operationInfoEntity record);

    operationInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(operationInfoEntity record);

    int updateByPrimaryKey(operationInfoEntity record);
}