package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.tpaClientPolInfoEntity;

public interface tpaClientPolInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tpaClientPolInfoEntity record);

    int insertSelective(tpaClientPolInfoEntity record);

    tpaClientPolInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tpaClientPolInfoEntity record);

    int updateByPrimaryKey(tpaClientPolInfoEntity record);
}