package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActReDeploymentEntity;

public interface ActReDeploymentEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActReDeploymentEntity record);

    int insertSelective(ActReDeploymentEntity record);

    ActReDeploymentEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActReDeploymentEntity record);

    int updateByPrimaryKey(ActReDeploymentEntity record);
}