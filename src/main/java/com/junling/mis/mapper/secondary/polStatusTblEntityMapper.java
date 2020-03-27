package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.polStatusTblEntity;

public interface polStatusTblEntityMapper {
    int deleteByPrimaryKey(String polStatus);

    int insert(polStatusTblEntity record);

    int insertSelective(polStatusTblEntity record);

    polStatusTblEntity selectByPrimaryKey(String polStatus);

    int updateByPrimaryKeySelective(polStatusTblEntity record);

    int updateByPrimaryKey(polStatusTblEntity record);
}