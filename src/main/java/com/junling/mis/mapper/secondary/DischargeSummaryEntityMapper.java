package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.DischargeSummaryEntity;

public interface DischargeSummaryEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(DischargeSummaryEntity record);

    int insertSelective(DischargeSummaryEntity record);

    DischargeSummaryEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DischargeSummaryEntity record);

    int updateByPrimaryKey(DischargeSummaryEntity record);
}