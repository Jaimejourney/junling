package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actHiCommentEntity;

public interface actHiCommentEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actHiCommentEntity record);

    int insertSelective(actHiCommentEntity record);

    actHiCommentEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actHiCommentEntity record);

    int updateByPrimaryKeyWithBLOBs(actHiCommentEntity record);

    int updateByPrimaryKey(actHiCommentEntity record);
}