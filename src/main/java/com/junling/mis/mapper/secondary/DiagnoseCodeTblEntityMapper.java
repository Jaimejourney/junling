package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.DiagnoseCodeTblEntity;

public interface DiagnoseCodeTblEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(DiagnoseCodeTblEntity record);

    int insertSelective(DiagnoseCodeTblEntity record);

    DiagnoseCodeTblEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DiagnoseCodeTblEntity record);

    int updateByPrimaryKey(DiagnoseCodeTblEntity record);
}