package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.emailLogEntity;

public interface emailLogEntityMapper {
    int deleteByPrimaryKey(Long emailLogId);

    int insert(emailLogEntity record);

    int insertSelective(emailLogEntity record);

    emailLogEntity selectByPrimaryKey(Long emailLogId);

    int updateByPrimaryKeySelective(emailLogEntity record);

    int updateByPrimaryKey(emailLogEntity record);
}