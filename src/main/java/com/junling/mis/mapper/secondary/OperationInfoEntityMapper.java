package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.OperationInfoEntity;

public interface OperationInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OperationInfoEntity record);

    int insertSelective(OperationInfoEntity record);

    OperationInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OperationInfoEntity record);

    int updateByPrimaryKey(OperationInfoEntity record);
}