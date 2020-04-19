package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.VisitRecordRenbaojianDetailEntity;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface VisitRecordRenbaojianDetailEntityMapper {
    int deleteByPrimaryKey(String visitId);

    int insert(VisitRecordRenbaojianDetailEntity record);

    int insertSelective(VisitRecordRenbaojianDetailEntity record);

    VisitRecordRenbaojianDetailEntity selectByPrimaryKey(String visitId);

    int updateByPrimaryKeySelective(VisitRecordRenbaojianDetailEntity record);

    int updateByPrimaryKeyWithBLOBs(VisitRecordRenbaojianDetailEntity record);

    int updateByPrimaryKey(VisitRecordRenbaojianDetailEntity record);

    List<VisitRecordRenbaojianDetailEntity> search(@Param("start") Date start);
}