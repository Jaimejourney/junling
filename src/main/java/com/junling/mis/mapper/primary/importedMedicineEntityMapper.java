package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.importedMedicineEntity;

public interface importedMedicineEntityMapper {
    int insert(importedMedicineEntity record);

    int insertSelective(importedMedicineEntity record);
}