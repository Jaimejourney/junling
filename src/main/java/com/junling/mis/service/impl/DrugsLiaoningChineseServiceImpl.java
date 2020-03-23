package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsLiaoningChineseEntityMapper;
import com.junling.mis.model.drugsLiaoningChineseEntity;
import com.junling.mis.service.DrugsLiaoningChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsLiaoningChineseService")
public class DrugsLiaoningChineseServiceImpl implements DrugsLiaoningChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsLiaoningChineseServiceImpl.class);

	@Resource
	private drugsLiaoningChineseEntityMapper drugsLiaoningChineseEntityMapper;


	@Override
	public Boolean addDrugsLiaoningChinese(drugsLiaoningChineseEntity drugsLiaoningChineseEntity) throws Exception {
		return drugsLiaoningChineseEntityMapper.insert(drugsLiaoningChineseEntity) > 0;
	}
}