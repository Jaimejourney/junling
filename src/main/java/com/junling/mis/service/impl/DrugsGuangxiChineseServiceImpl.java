package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsGuangxiChineseEntityMapper;
import com.junling.mis.model.drugsGuangxiChineseEntity;
import com.junling.mis.service.DrugsGuangxiChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsGuangxiChineseService")
public class DrugsGuangxiChineseServiceImpl implements DrugsGuangxiChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsGuangxiChineseServiceImpl.class);

	@Resource
	private drugsGuangxiChineseEntityMapper drugsGuangxiChineseEntityMapper;


	@Override
	public Boolean addDrugsGuangxiChinese(drugsGuangxiChineseEntity drugsGuangxiChineseEntity) throws Exception {
		return drugsGuangxiChineseEntityMapper.insert(drugsGuangxiChineseEntity) > 0;
	}
}