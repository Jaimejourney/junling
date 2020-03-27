package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.labReportTblEntity;

public interface labReportTblEntityMapper {
    int deleteByPrimaryKey(String labflow);

    int insert(labReportTblEntity record);

    int insertSelective(labReportTblEntity record);

    labReportTblEntity selectByPrimaryKey(String labflow);

    int updateByPrimaryKeySelective(labReportTblEntity record);

    int updateByPrimaryKey(labReportTblEntity record);
}