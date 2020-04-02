package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.rejectCause;

public interface rejectCauseMapper {
    int deleteByPrimaryKey(String rejectCauseCode);

    int insert(rejectCause record);

    int insertSelective(rejectCause record);

    rejectCause selectByPrimaryKey(String rejectCauseCode);

    int updateByPrimaryKeySelective(rejectCause record);

    int updateByPrimaryKey(rejectCause record);
}