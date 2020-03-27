package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actRuDeadletterJobEntity;

public interface actRuDeadletterJobEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actRuDeadletterJobEntity record);

    int insertSelective(actRuDeadletterJobEntity record);

    actRuDeadletterJobEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actRuDeadletterJobEntity record);

    int updateByPrimaryKey(actRuDeadletterJobEntity record);
}