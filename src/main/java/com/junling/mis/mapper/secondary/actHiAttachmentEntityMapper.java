package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actHiAttachmentEntity;

public interface actHiAttachmentEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actHiAttachmentEntity record);

    int insertSelective(actHiAttachmentEntity record);

    actHiAttachmentEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actHiAttachmentEntity record);

    int updateByPrimaryKey(actHiAttachmentEntity record);
}