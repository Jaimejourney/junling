package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.PolMainEntity;

public interface PolMainEntityMapper {
    int deleteByPrimaryKey(String polno);

    int insert(PolMainEntity record);

    int insertSelective(PolMainEntity record);

    PolMainEntity selectByPrimaryKey(String polno);

    int updateByPrimaryKeySelective(PolMainEntity record);

    int updateByPrimaryKey(PolMainEntity record);
}