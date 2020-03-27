package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.idGeneratorEntityKey;

public interface idGeneratorEntityMapper {
    int deleteByPrimaryKey(idGeneratorEntityKey key);

    int insert(idGeneratorEntityKey record);

    int insertSelective(idGeneratorEntityKey record);
}