package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsNeimengguChineseEntityMapper;
import com.junling.mis.model.drugsNeimengguChineseEntity;
import com.junling.mis.service.DrugsNeimengguChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsNeimengguChineseService")
public class DrugsNeimengguChineseServiceImpl implements DrugsNeimengguChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsNeimengguChineseServiceImpl.class);

	@Resource
	private drugsNeimengguChineseEntityMapper drugsNeimengguChineseEntityMapper;


	@Override
	public Boolean addDrugsNeimengguChinese(drugsNeimengguChineseEntity drugsNeimengguChineseEntity) throws Exception {
		return drugsNeimengguChineseEntityMapper.insert(drugsNeimengguChineseEntity) > 0;
	}
}