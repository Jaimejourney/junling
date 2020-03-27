package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actHiIdentitylinkEntity;

public interface actHiIdentitylinkEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actHiIdentitylinkEntity record);

    int insertSelective(actHiIdentitylinkEntity record);

    actHiIdentitylinkEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actHiIdentitylinkEntity record);

    int updateByPrimaryKey(actHiIdentitylinkEntity record);
}