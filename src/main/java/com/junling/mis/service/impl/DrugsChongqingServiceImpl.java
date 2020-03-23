package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsChongqingEntityMapper;
import com.junling.mis.model.drugsChongqingEntity;
import com.junling.mis.service.DrugsChongqingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsChongqingService")
public class DrugsChongqingServiceImpl implements DrugsChongqingService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsChongqingServiceImpl.class);

	@Resource
	private drugsChongqingEntityMapper drugsChongqingEntityMapper;


	@Override
	public Boolean addDrugsChongqing(drugsChongqingEntity drugsChongqingEntity) throws Exception {
		return drugsChongqingEntityMapper.insert(drugsChongqingEntity) > 0;
	}
}