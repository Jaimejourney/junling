package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.PolicyHealthNote;

public interface PolicyHealthNoteMapper {
    int deleteByPrimaryKey(String healthId);

    int insert(PolicyHealthNote record);

    int insertSelective(PolicyHealthNote record);

    PolicyHealthNote selectByPrimaryKey(String healthId);

    int updateByPrimaryKeySelective(PolicyHealthNote record);

    int updateByPrimaryKey(PolicyHealthNote record);
}