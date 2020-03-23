package com.junling.mis.mapper;

import com.junling.mis.model.importedMedicineCopyEntity;

public interface importedMedicineCopyEntityMapper {
    int insert(importedMedicineCopyEntity record);

    int insertSelective(importedMedicineCopyEntity record);
}