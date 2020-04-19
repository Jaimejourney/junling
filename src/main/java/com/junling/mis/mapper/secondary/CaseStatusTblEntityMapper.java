package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.CaseStatusTblEntity;

public interface CaseStatusTblEntityMapper {
    int insert(CaseStatusTblEntity record);

    int insertSelective(CaseStatusTblEntity record);
}