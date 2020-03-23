package com.junling.mis.mapper;

import com.junling.mis.model.rejectCauseEntity;

public interface rejectCauseEntityMapper {
    int deleteByPrimaryKey(String rejectCauseCode);

    int insert(rejectCauseEntity record);

    int insertSelective(rejectCauseEntity record);

    rejectCauseEntity selectByPrimaryKey(String rejectCauseCode);

    int updateByPrimaryKeySelective(rejectCauseEntity record);

    int updateByPrimaryKey(rejectCauseEntity record);
}