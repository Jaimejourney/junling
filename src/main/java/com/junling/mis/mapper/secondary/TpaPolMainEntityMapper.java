package com.junling.mis.mapper.secondary;

import com.junling.mis.model.primary.PolicyInfo;
import com.junling.mis.model.secondary.TpaPolMainEntity;

public interface TpaPolMainEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TpaPolMainEntity record);

    int insertSelective(TpaPolMainEntity record);

    TpaPolMainEntity selectByPrimaryKey(Long id);

    TpaPolMainEntity selectByPolNo(String polNo);

    int updateByPrimaryKeySelective(TpaPolMainEntity record);

    int updateByPrimaryKey(TpaPolMainEntity record);
}