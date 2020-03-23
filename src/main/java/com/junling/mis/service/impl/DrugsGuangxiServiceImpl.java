package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsGuangxiEntityMapper;
import com.junling.mis.model.drugsGuangxiEntity;
import com.junling.mis.service.DrugsGuangxiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsGuangxiService")
public class DrugsGuangxiServiceImpl implements DrugsGuangxiService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsGuangxiServiceImpl.class);

	@Resource
	private drugsGuangxiEntityMapper drugsGuangxiEntityMapper;


	@Override
	public Boolean addDrugsGuangxi(drugsGuangxiEntity drugsGuangxiEntity) throws Exception {
		return drugsGuangxiEntityMapper.insert(drugsGuangxiEntity) > 0;
	}
}