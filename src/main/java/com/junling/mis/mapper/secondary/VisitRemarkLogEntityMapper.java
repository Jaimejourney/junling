package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.VisitRemarkLogEntity;

public interface VisitRemarkLogEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VisitRemarkLogEntity record);

    int insertSelective(VisitRemarkLogEntity record);

    VisitRemarkLogEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VisitRemarkLogEntity record);

    int updateByPrimaryKey(VisitRemarkLogEntity record);
}