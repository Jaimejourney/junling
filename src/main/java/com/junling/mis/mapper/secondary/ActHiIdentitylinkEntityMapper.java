package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActHiIdentitylinkEntity;

public interface ActHiIdentitylinkEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActHiIdentitylinkEntity record);

    int insertSelective(ActHiIdentitylinkEntity record);

    ActHiIdentitylinkEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActHiIdentitylinkEntity record);

    int updateByPrimaryKey(ActHiIdentitylinkEntity record);
}