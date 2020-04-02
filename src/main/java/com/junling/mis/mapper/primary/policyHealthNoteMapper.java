package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyHealthNote;

public interface policyHealthNoteMapper {
    int deleteByPrimaryKey(String healthId);

    int insert(policyHealthNote record);

    int insertSelective(policyHealthNote record);

    policyHealthNote selectByPrimaryKey(String healthId);

    int updateByPrimaryKeySelective(policyHealthNote record);

    int updateByPrimaryKey(policyHealthNote record);
}