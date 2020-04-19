package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.VisitRecordProcessEntity;

public interface VisitRecordProcessEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VisitRecordProcessEntity record);

    int insertSelective(VisitRecordProcessEntity record);

    VisitRecordProcessEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VisitRecordProcessEntity record);

    int updateByPrimaryKey(VisitRecordProcessEntity record);
}