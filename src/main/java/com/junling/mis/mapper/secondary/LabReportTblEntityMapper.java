package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.LabReportTblEntity;

public interface LabReportTblEntityMapper {
    int deleteByPrimaryKey(String labflow);

    int insert(LabReportTblEntity record);

    int insertSelective(LabReportTblEntity record);

    LabReportTblEntity selectByPrimaryKey(String labflow);

    int updateByPrimaryKeySelective(LabReportTblEntity record);

    int updateByPrimaryKey(LabReportTblEntity record);
}