package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsHubeiChineseEntityMapper;
import com.junling.mis.model.drugsHubeiChineseEntity;
import com.junling.mis.service.DrugsHubeiChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsHubeiChineseService")
public class DrugsHubeiChineseServiceImpl implements DrugsHubeiChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsHubeiChineseServiceImpl.class);

	@Resource
	private drugsHubeiChineseEntityMapper drugsHubeiChineseEntityMapper;


	@Override
	public Boolean addDrugsHubeiChinese(drugsHubeiChineseEntity drugsHubeiChineseEntity) throws Exception {
		return drugsHubeiChineseEntityMapper.insert(drugsHubeiChineseEntity) > 0;
	}
}