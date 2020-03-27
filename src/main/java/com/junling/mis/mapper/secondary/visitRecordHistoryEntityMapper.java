package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.visitRecordHistoryEntity;

public interface visitRecordHistoryEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(visitRecordHistoryEntity record);

    int insertSelective(visitRecordHistoryEntity record);

    visitRecordHistoryEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(visitRecordHistoryEntity record);

    int updateByPrimaryKey(visitRecordHistoryEntity record);
}