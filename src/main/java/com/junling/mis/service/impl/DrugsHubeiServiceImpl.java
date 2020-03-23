package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsHubeiEntityMapper;
import com.junling.mis.model.drugsHubeiEntity;
import com.junling.mis.service.DrugsHubeiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsHubeiService")
public class DrugsHubeiServiceImpl implements DrugsHubeiService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsHubeiServiceImpl.class);

	@Resource
	private drugsHubeiEntityMapper drugsHubeiEntityMapper;


	@Override
	public Boolean addDrugsHubei(drugsHubeiEntity drugsHubeiEntity) throws Exception {
		return drugsHubeiEntityMapper.insert(drugsHubeiEntity) > 0;
	}
}