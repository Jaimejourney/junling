package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.polMainEntity;

public interface polMainEntityMapper {
    int deleteByPrimaryKey(String polno);

    int insert(polMainEntity record);

    int insertSelective(polMainEntity record);

    polMainEntity selectByPrimaryKey(String polno);

    int updateByPrimaryKeySelective(polMainEntity record);

    int updateByPrimaryKey(polMainEntity record);
}