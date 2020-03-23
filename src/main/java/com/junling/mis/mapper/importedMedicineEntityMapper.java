package com.junling.mis.mapper;

import com.junling.mis.model.importedMedicineEntity;

public interface importedMedicineEntityMapper {
    int insert(importedMedicineEntity record);

    int insertSelective(importedMedicineEntity record);
}