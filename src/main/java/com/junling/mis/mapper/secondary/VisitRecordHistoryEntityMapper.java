package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.VisitRecordHistoryEntity;

public interface VisitRecordHistoryEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VisitRecordHistoryEntity record);

    int insertSelective(VisitRecordHistoryEntity record);

    VisitRecordHistoryEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VisitRecordHistoryEntity record);

    int updateByPrimaryKey(VisitRecordHistoryEntity record);
}