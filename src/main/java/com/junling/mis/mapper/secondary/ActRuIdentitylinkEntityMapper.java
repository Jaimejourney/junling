package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActRuIdentitylinkEntity;

public interface ActRuIdentitylinkEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActRuIdentitylinkEntity record);

    int insertSelective(ActRuIdentitylinkEntity record);

    ActRuIdentitylinkEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActRuIdentitylinkEntity record);

    int updateByPrimaryKey(ActRuIdentitylinkEntity record);
}