package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimLiabCal2Entity;

public interface claimLiabCal2EntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(claimLiabCal2Entity record);

    int insertSelective(claimLiabCal2Entity record);

    claimLiabCal2Entity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(claimLiabCal2Entity record);

    int updateByPrimaryKey(claimLiabCal2Entity record);
}