package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.tpaPolMainEntity;

public interface tpaPolMainEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(tpaPolMainEntity record);

    int insertSelective(tpaPolMainEntity record);

    tpaPolMainEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(tpaPolMainEntity record);

    int updateByPrimaryKey(tpaPolMainEntity record);
}