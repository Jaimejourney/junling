package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsEntityMapper;
import com.junling.mis.model.drugsEntity;
import com.junling.mis.service.DrugsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsService")
public class DrugsServiceImpl implements DrugsService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsServiceImpl.class);

	@Resource
	private drugsEntityMapper drugsEntityMapper;


	@Override
	public Boolean addDrugs(drugsEntity drugsEntity) throws Exception {
		return drugsEntityMapper.insert(drugsEntity) > 0;
	}
}