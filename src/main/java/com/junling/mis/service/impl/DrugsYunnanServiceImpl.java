package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsYunnanEntityMapper;
import com.junling.mis.model.drugsYunnanEntity;
import com.junling.mis.service.DrugsYunnanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsYunnanService")
public class DrugsYunnanServiceImpl implements DrugsYunnanService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsYunnanServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.drugsYunnanEntityMapper drugsYunnanEntityMapper;


	@Override
	public Boolean addDrugsYunnan(drugsYunnanEntity drugsYunnanEntity) throws Exception {
		return drugsYunnanEntityMapper.insert(drugsYunnanEntity) >0;
	}
}