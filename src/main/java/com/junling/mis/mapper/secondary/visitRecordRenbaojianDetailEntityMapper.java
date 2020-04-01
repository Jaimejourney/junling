package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.visitRecordRenbaojianDetailEntity;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface visitRecordRenbaojianDetailEntityMapper {
    int deleteByPrimaryKey(String visitId);

    int insert(visitRecordRenbaojianDetailEntity record);

    int insertSelective(visitRecordRenbaojianDetailEntity record);

    visitRecordRenbaojianDetailEntity selectByPrimaryKey(String visitId);

    int updateByPrimaryKeySelective(visitRecordRenbaojianDetailEntity record);

    int updateByPrimaryKeyWithBLOBs(visitRecordRenbaojianDetailEntity record);

    int updateByPrimaryKey(visitRecordRenbaojianDetailEntity record);

    List<visitRecordRenbaojianDetailEntity> search(@Param("start") Date start);
}