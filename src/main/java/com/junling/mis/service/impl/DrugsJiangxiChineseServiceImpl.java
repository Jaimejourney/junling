package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsJiangxiChineseEntityMapper;
import com.junling.mis.model.drugsJiangxiChineseEntity;
import com.junling.mis.service.DrugsJiangxiChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsJiangxiChineseService")
public class DrugsJiangxiChineseServiceImpl implements DrugsJiangxiChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsJiangxiChineseServiceImpl.class);

	@Resource
	private drugsJiangxiChineseEntityMapper drugsJiangxiChineseEntityMapper;


	@Override
	public Boolean addDrugsJiangxiChinese(drugsJiangxiChineseEntity drugsJiangxiChineseEntity) throws Exception {
		return drugsJiangxiChineseEntityMapper.insert(drugsJiangxiChineseEntity) > 0;
	}
}