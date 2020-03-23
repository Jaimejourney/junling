package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsBeijingEntityMapper;
import com.junling.mis.model.drugsBeijingEntity;
import com.junling.mis.service.DrugsBeijingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsBeijingService")
public class DrugsBeijingServiceImpl implements DrugsBeijingService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsBeijingServiceImpl.class);

	@Resource
	private drugsBeijingEntityMapper drugsBeijingEntityMapper;

	@Override
	public Boolean addDrugsBeijing(drugsBeijingEntity drugsBeijingEntity) throws Exception {
		return drugsBeijingEntityMapper.insert(drugsBeijingEntity) > 0;
	}
}