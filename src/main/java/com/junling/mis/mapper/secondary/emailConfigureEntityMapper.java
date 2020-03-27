package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.emailConfigureEntity;

public interface emailConfigureEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(emailConfigureEntity record);

    int insertSelective(emailConfigureEntity record);

    emailConfigureEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(emailConfigureEntity record);

    int updateByPrimaryKey(emailConfigureEntity record);
}