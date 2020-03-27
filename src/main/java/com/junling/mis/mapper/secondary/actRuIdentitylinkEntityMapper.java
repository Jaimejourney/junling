package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actRuIdentitylinkEntity;

public interface actRuIdentitylinkEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actRuIdentitylinkEntity record);

    int insertSelective(actRuIdentitylinkEntity record);

    actRuIdentitylinkEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actRuIdentitylinkEntity record);

    int updateByPrimaryKey(actRuIdentitylinkEntity record);
}