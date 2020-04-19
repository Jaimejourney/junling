package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimApplicantInfoEntity;

public interface ClaimApplicantInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClaimApplicantInfoEntity record);

    int insertSelective(ClaimApplicantInfoEntity record);

    ClaimApplicantInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClaimApplicantInfoEntity record);

    int updateByPrimaryKey(ClaimApplicantInfoEntity record);
}