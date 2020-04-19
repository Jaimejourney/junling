package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.UserVisitInfoEntity;

public interface UserVisitInfoEntityMapper {
    int deleteByPrimaryKey(String visitId);

    int insert(UserVisitInfoEntity record);

    int insertSelective(UserVisitInfoEntity record);

    UserVisitInfoEntity selectByPrimaryKey(String visitId);

    int updateByPrimaryKeySelective(UserVisitInfoEntity record);

    int updateByPrimaryKey(UserVisitInfoEntity record);
}