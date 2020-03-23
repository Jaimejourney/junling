package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsGuizhouEntityMapper;
import com.junling.mis.model.drugsGuizhouEntity;
import com.junling.mis.service.DrugsGuizhouService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsGuizhouService")
public class DrugsGuizhouServiceImpl implements DrugsGuizhouService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsGuizhouServiceImpl.class);

	@Resource
	private drugsGuizhouEntityMapper drugsGuizhouEntityMapper;


	@Override
	public Boolean addDrugsGuizhou(drugsGuizhouEntity drugsGuizhouEntity) throws Exception {
		return drugsGuizhouEntityMapper.insert(drugsGuizhouEntity) > 0;
	}
}