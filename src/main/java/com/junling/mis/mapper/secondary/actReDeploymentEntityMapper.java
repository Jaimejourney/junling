package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actReDeploymentEntity;

public interface actReDeploymentEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actReDeploymentEntity record);

    int insertSelective(actReDeploymentEntity record);

    actReDeploymentEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actReDeploymentEntity record);

    int updateByPrimaryKey(actReDeploymentEntity record);
}