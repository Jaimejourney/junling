package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.LabReportMicrobesInfoEntity;

public interface LabReportMicrobesInfoEntityMapper {
    int deleteByPrimaryKey(String recordmicrobesflow);

    int insert(LabReportMicrobesInfoEntity record);

    int insertSelective(LabReportMicrobesInfoEntity record);

    LabReportMicrobesInfoEntity selectByPrimaryKey(String recordmicrobesflow);

    int updateByPrimaryKeySelective(LabReportMicrobesInfoEntity record);

    int updateByPrimaryKey(LabReportMicrobesInfoEntity record);
}