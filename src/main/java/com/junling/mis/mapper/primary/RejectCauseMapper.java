package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.RejectCause;

public interface RejectCauseMapper {
    int deleteByPrimaryKey(String rejectCauseCode);

    int insert(RejectCause record);

    int insertSelective(RejectCause record);

    RejectCause selectByPrimaryKey(String rejectCauseCode);

    int updateByPrimaryKeySelective(RejectCause record);

    int updateByPrimaryKey(RejectCause record);
}