package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsHainanEntityMapper;
import com.junling.mis.model.drugsHainanEntity;
import com.junling.mis.service.DrugsHainanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsHainanService")
public class DrugsHainanServiceImpl implements DrugsHainanService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsHainanServiceImpl.class);

	@Resource
	private drugsHainanEntityMapper drugsHainanEntityMapper;


	@Override
	public Boolean addDrugsHainan(drugsHainanEntity drugsHainanEntity) throws Exception {
		return drugsHainanEntityMapper.insert(drugsHainanEntity) > 0;
	}
}