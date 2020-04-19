package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ReportExcessRecordEntity;

public interface ReportExcessRecordEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReportExcessRecordEntity record);

    int insertSelective(ReportExcessRecordEntity record);

    ReportExcessRecordEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReportExcessRecordEntity record);

    int updateByPrimaryKey(ReportExcessRecordEntity record);
}