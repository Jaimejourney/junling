package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyHealthNoteEntity;

public interface policyHealthNoteEntityMapper {
    int deleteByPrimaryKey(String healthNoteId);

    int insert(policyHealthNoteEntity record);

    int insertSelective(policyHealthNoteEntity record);

    policyHealthNoteEntity selectByPrimaryKey(String healthNoteId);

    int updateByPrimaryKeySelective(policyHealthNoteEntity record);

    int updateByPrimaryKey(policyHealthNoteEntity record);
}