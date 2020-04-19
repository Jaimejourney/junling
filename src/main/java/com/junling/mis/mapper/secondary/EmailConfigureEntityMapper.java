package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.EmailConfigureEntity;

public interface EmailConfigureEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmailConfigureEntity record);

    int insertSelective(EmailConfigureEntity record);

    EmailConfigureEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmailConfigureEntity record);

    int updateByPrimaryKey(EmailConfigureEntity record);
}