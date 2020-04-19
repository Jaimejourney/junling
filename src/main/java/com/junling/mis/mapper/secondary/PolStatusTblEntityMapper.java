package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.PolStatusTblEntity;

public interface PolStatusTblEntityMapper {
    int deleteByPrimaryKey(String polStatus);

    int insert(PolStatusTblEntity record);

    int insertSelective(PolStatusTblEntity record);

    PolStatusTblEntity selectByPrimaryKey(String polStatus);

    int updateByPrimaryKeySelective(PolStatusTblEntity record);

    int updateByPrimaryKey(PolStatusTblEntity record);
}