package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.reportExcessRecordEntity;

public interface reportExcessRecordEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(reportExcessRecordEntity record);

    int insertSelective(reportExcessRecordEntity record);

    reportExcessRecordEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(reportExcessRecordEntity record);

    int updateByPrimaryKey(reportExcessRecordEntity record);
}