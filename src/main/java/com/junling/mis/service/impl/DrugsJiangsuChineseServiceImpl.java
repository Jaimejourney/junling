package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsJiangsuChineseEntityMapper;
import com.junling.mis.model.drugsJiangsuChineseEntity;
import com.junling.mis.service.DrugsJiangsuChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsJiangsuChineseService")
public class DrugsJiangsuChineseServiceImpl implements DrugsJiangsuChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsJiangsuChineseServiceImpl.class);

	@Resource
	private drugsJiangsuChineseEntityMapper drugsJiangsuChineseEntityMapper;


	@Override
	public Boolean addDrugsJiangsuChinese(drugsJiangsuChineseEntity drugsJiangsuChineseEntity) throws Exception {
		return drugsJiangsuChineseEntityMapper.insert(drugsJiangsuChineseEntity) > 0;
	}
}