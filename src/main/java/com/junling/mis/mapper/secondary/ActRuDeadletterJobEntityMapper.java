package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActRuDeadletterJobEntity;

public interface ActRuDeadletterJobEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActRuDeadletterJobEntity record);

    int insertSelective(ActRuDeadletterJobEntity record);

    ActRuDeadletterJobEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActRuDeadletterJobEntity record);

    int updateByPrimaryKey(ActRuDeadletterJobEntity record);
}