package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.riskDetailStddiseaseEntity;

public interface riskDetailStddiseaseEntityMapper {
    int deleteByPrimaryKey(Integer stddiseaseid);

    int insert(riskDetailStddiseaseEntity record);

    int insertSelective(riskDetailStddiseaseEntity record);

    riskDetailStddiseaseEntity selectByPrimaryKey(Integer stddiseaseid);

    int updateByPrimaryKeySelective(riskDetailStddiseaseEntity record);

    int updateByPrimaryKey(riskDetailStddiseaseEntity record);
}