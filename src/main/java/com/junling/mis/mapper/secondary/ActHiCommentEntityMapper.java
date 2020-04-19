package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActHiCommentEntity;

public interface ActHiCommentEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActHiCommentEntity record);

    int insertSelective(ActHiCommentEntity record);

    ActHiCommentEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActHiCommentEntity record);

    int updateByPrimaryKeyWithBLOBs(ActHiCommentEntity record);

    int updateByPrimaryKey(ActHiCommentEntity record);
}