package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.IdGeneratorEntityKey;

public interface IdGeneratorEntityMapper {
    int deleteByPrimaryKey(IdGeneratorEntityKey key);

    int insert(IdGeneratorEntityKey record);

    int insertSelective(IdGeneratorEntityKey record);
}