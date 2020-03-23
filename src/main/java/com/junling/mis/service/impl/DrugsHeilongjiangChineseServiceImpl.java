package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsHeilongjiangChineseEntityMapper;
import com.junling.mis.model.drugsHeilongjiangChineseEntity;
import com.junling.mis.service.DrugsHeilongjiangChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsHeilongjiangChineseService")
public class DrugsHeilongjiangChineseServiceImpl implements DrugsHeilongjiangChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsHeilongjiangChineseServiceImpl.class);

	@Resource
	private drugsHeilongjiangChineseEntityMapper drugsHeilongjiangChineseEntityMapper;


	@Override
	public Boolean addDrugsHeilongjiangChinese(drugsHeilongjiangChineseEntity drugsHeilongjiangChineseEntity) throws Exception {
		return drugsHeilongjiangChineseEntityMapper.insert(drugsHeilongjiangChineseEntity) > 0;
	}
}