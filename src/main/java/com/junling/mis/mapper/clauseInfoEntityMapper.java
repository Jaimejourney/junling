package com.junling.mis.mapper;

import com.junling.mis.model.clauseInfoEntity;

public interface clauseInfoEntityMapper {
    int deleteByPrimaryKey(String clauseId);

    int insert(clauseInfoEntity record);

    int insertSelective(clauseInfoEntity record);

    clauseInfoEntity selectByPrimaryKey(String clauseId);

    int updateByPrimaryKeySelective(clauseInfoEntity record);

    int updateByPrimaryKeyWithBLOBs(clauseInfoEntity record);

    int updateByPrimaryKey(clauseInfoEntity record);
}