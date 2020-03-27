package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsHubeiEntityMapper;
import com.junling.mis.model.primary.drugsHubeiEntity;
import com.junling.mis.service.primary.DrugsHubeiService;
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