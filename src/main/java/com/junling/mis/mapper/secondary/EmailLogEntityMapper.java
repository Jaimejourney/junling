package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.EmailLogEntity;

public interface EmailLogEntityMapper {
    int deleteByPrimaryKey(Long emailLogId);

    int insert(EmailLogEntity record);

    int insertSelective(EmailLogEntity record);

    EmailLogEntity selectByPrimaryKey(Long emailLogId);

    int updateByPrimaryKeySelective(EmailLogEntity record);

    int updateByPrimaryKey(EmailLogEntity record);
}