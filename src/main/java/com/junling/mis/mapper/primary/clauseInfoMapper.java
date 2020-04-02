package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.clauseInfo;

public interface clauseInfoMapper {
    int deleteByPrimaryKey(String clauseId);

    int insert(clauseInfo record);

    int insertSelective(clauseInfo record);

    clauseInfo selectByPrimaryKey(String clauseId);

    int updateByPrimaryKeySelective(clauseInfo record);

    int updateByPrimaryKeyWithBLOBs(clauseInfo record);

    int updateByPrimaryKey(clauseInfo record);
}