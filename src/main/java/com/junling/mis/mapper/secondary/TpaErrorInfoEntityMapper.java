package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.TpaErrorInfoEntity;

public interface TpaErrorInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TpaErrorInfoEntity record);

    int insertSelective(TpaErrorInfoEntity record);

    TpaErrorInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TpaErrorInfoEntity record);

    int updateByPrimaryKeyWithBLOBs(TpaErrorInfoEntity record);

    int updateByPrimaryKey(TpaErrorInfoEntity record);
}