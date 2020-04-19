package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActHiAttachmentEntity;

public interface ActHiAttachmentEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActHiAttachmentEntity record);

    int insertSelective(ActHiAttachmentEntity record);

    ActHiAttachmentEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActHiAttachmentEntity record);

    int updateByPrimaryKey(ActHiAttachmentEntity record);
}