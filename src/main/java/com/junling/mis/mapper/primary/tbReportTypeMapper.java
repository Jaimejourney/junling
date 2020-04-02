package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbReportType;

public interface tbReportTypeMapper {
    int deleteByPrimaryKey(String reportTypeCode);

    int insert(tbReportType record);

    int insertSelective(tbReportType record);

    tbReportType selectByPrimaryKey(String reportTypeCode);

    int updateByPrimaryKeySelective(tbReportType record);

    int updateByPrimaryKey(tbReportType record);
}