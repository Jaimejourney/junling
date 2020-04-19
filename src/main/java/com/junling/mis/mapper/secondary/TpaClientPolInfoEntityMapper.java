package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.TpaClientPolInfoEntity;

public interface TpaClientPolInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TpaClientPolInfoEntity record);

    int insertSelective(TpaClientPolInfoEntity record);

    TpaClientPolInfoEntity selectByPrimaryKey(Integer id);

    TpaClientPolInfoEntity selectByPolNo(String polNo);

    int updateByPrimaryKeySelective(TpaClientPolInfoEntity record);

    int updateByPrimaryKey(TpaClientPolInfoEntity record);
}