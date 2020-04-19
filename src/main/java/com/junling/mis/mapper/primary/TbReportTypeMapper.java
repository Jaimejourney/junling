package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbReportType;

public interface TbReportTypeMapper {
    int deleteByPrimaryKey(String reportTypeCode);

    int insert(TbReportType record);

    int insertSelective(TbReportType record);

    TbReportType selectByPrimaryKey(String reportTypeCode);

    int updateByPrimaryKeySelective(TbReportType record);

    int updateByPrimaryKey(TbReportType record);
}