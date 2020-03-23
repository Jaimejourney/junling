package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsHunanEntityMapper;
import com.junling.mis.model.drugsHunanEntity;
import com.junling.mis.service.DrugsHunanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsHunanService")
public class DrugsHunanServiceImpl implements DrugsHunanService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsHunanServiceImpl.class);

	@Resource
	private drugsHunanEntityMapper drugsHunanEntityMapper;


	@Override
	public Boolean addDrugsHunan(drugsHunanEntity drugsHunanEntity) throws Exception {
		return drugsHunanEntityMapper.insert(drugsHunanEntity) > 0;
	}
}