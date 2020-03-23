package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsHenanEntityMapper;
import com.junling.mis.model.drugsHenanEntity;
import com.junling.mis.service.DrugsHenanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsHenanService")
public class DrugsHenanServiceImpl implements DrugsHenanService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsHenanServiceImpl.class);

	@Resource
	private drugsHenanEntityMapper drugsHenanEntityMapper;

	@Override
	public Boolean addDrugsHenan(drugsHenanEntity drugsHenanEntity) throws Exception {
		return drugsHenanEntityMapper.insert(drugsHenanEntity) > 0;
	}
}