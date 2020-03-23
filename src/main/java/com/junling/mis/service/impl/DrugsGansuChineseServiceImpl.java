package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsGansuChineseEntityMapper;
import com.junling.mis.model.drugsGansuChineseEntity;
import com.junling.mis.service.DrugsGansuChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsGansuChineseService")
public class DrugsGansuChineseServiceImpl implements DrugsGansuChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsGansuChineseServiceImpl.class);

	@Resource
	private drugsGansuChineseEntityMapper drugsGansuChineseEntityMapper;


	@Override
	public Boolean addDrugsGansuChinese(drugsGansuChineseEntity drugsGansuChineseEntity) throws Exception {
		return drugsGansuChineseEntityMapper.insert(drugsGansuChineseEntity) > 0;
	}
}