package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.caseStatusTblEntity;

public interface caseStatusTblEntityMapper {
    int insert(caseStatusTblEntity record);

    int insertSelective(caseStatusTblEntity record);
}