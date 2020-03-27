package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.jlverifylogEntity;

public interface jlverifylogEntityMapper {
    int deleteByPrimaryKey(String jlVerifySeq);

    int insert(jlverifylogEntity record);

    int insertSelective(jlverifylogEntity record);

    jlverifylogEntity selectByPrimaryKey(String jlVerifySeq);

    int updateByPrimaryKeySelective(jlverifylogEntity record);

    int updateByPrimaryKey(jlverifylogEntity record);
}