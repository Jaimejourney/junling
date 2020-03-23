package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsHebeiChineseEntityMapper;
import com.junling.mis.model.drugsHebeiChineseEntity;
import com.junling.mis.service.DrugsHebeiChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsHebeiChineseService")
public class DrugsHebeiChineseServiceImpl implements DrugsHebeiChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsHebeiChineseServiceImpl.class);

	@Resource
	private drugsHebeiChineseEntityMapper drugsHebeiChineseEntityMapper;


	@Override
	public Boolean addDrugsHebeiChinese(drugsHebeiChineseEntity drugsHebeiChineseEntity) throws Exception {
		return drugsHebeiChineseEntityMapper.insert(drugsHebeiChineseEntity) > 0;
	}
}