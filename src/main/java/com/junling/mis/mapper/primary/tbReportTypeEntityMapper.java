package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbReportTypeEntity;

public interface tbReportTypeEntityMapper {
    int deleteByPrimaryKey(String reportTypeCode);

    int insert(tbReportTypeEntity record);

    int insertSelective(tbReportTypeEntity record);

    tbReportTypeEntity selectByPrimaryKey(String reportTypeCode);

    int updateByPrimaryKeySelective(tbReportTypeEntity record);

    int updateByPrimaryKey(tbReportTypeEntity record);
}