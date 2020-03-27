package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.rejectCauseEntity;

public interface rejectCauseEntityMapper {
    int deleteByPrimaryKey(String rejectCauseCode);

    int insert(rejectCauseEntity record);

    int insertSelective(rejectCauseEntity record);

    rejectCauseEntity selectByPrimaryKey(String rejectCauseCode);

    int updateByPrimaryKeySelective(rejectCauseEntity record);

    int updateByPrimaryKey(rejectCauseEntity record);
}