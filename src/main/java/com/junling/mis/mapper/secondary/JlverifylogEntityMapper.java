package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.JlverifylogEntity;

public interface JlverifylogEntityMapper {
    int deleteByPrimaryKey(String jlVerifySeq);

    int insert(JlverifylogEntity record);

    int insertSelective(JlverifylogEntity record);

    JlverifylogEntity selectByPrimaryKey(String jlVerifySeq);

    int updateByPrimaryKeySelective(JlverifylogEntity record);

    int updateByPrimaryKey(JlverifylogEntity record);
}