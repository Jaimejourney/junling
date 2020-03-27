package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.userVisitInfoEntity;

public interface userVisitInfoEntityMapper {
    int deleteByPrimaryKey(String visitId);

    int insert(userVisitInfoEntity record);

    int insertSelective(userVisitInfoEntity record);

    userVisitInfoEntity selectByPrimaryKey(String visitId);

    int updateByPrimaryKeySelective(userVisitInfoEntity record);

    int updateByPrimaryKey(userVisitInfoEntity record);
}