package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.diagnoseCodeTblEntity;

public interface diagnoseCodeTblEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(diagnoseCodeTblEntity record);

    int insertSelective(diagnoseCodeTblEntity record);

    diagnoseCodeTblEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(diagnoseCodeTblEntity record);

    int updateByPrimaryKey(diagnoseCodeTblEntity record);
}