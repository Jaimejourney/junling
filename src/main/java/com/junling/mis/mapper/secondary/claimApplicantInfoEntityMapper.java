package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimApplicantInfoEntity;

public interface claimApplicantInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(claimApplicantInfoEntity record);

    int insertSelective(claimApplicantInfoEntity record);

    claimApplicantInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(claimApplicantInfoEntity record);

    int updateByPrimaryKey(claimApplicantInfoEntity record);
}