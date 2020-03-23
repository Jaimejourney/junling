package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsAnhuiChineseEntityMapper;
import com.junling.mis.model.drugsAnhuiChineseEntity;
import com.junling.mis.service.DrugsAnhuiChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsAnhuiChineseService")
public class DrugsAnhuiChineseServiceImpl implements DrugsAnhuiChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsAnhuiChineseServiceImpl.class);

	@Resource
	private drugsAnhuiChineseEntityMapper drugsAnhuiChineseEntityMapper;


	@Override
	public Boolean addDrugsAnhuiChinese(drugsAnhuiChineseEntity drugsAnhuiChineseEntity) throws Exception {
		return null;
	}
}