package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.dischargeSummaryEntity;

public interface dischargeSummaryEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(dischargeSummaryEntity record);

    int insertSelective(dischargeSummaryEntity record);

    dischargeSummaryEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(dischargeSummaryEntity record);

    int updateByPrimaryKey(dischargeSummaryEntity record);
}