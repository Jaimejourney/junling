package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.tpaErrorInfoEntity;

public interface tpaErrorInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tpaErrorInfoEntity record);

    int insertSelective(tpaErrorInfoEntity record);

    tpaErrorInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tpaErrorInfoEntity record);

    int updateByPrimaryKeyWithBLOBs(tpaErrorInfoEntity record);

    int updateByPrimaryKey(tpaErrorInfoEntity record);
}