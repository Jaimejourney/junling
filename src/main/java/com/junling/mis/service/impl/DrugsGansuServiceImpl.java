package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsGansuEntityMapper;
import com.junling.mis.model.drugsGansuEntity;
import com.junling.mis.service.DrugsGansuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsGansuService")
public class DrugsGansuServiceImpl implements DrugsGansuService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsGansuServiceImpl.class);

	@Resource
	private drugsGansuEntityMapper drugsGansuEntityMapper;


	@Override
	public Boolean addDrugsGansu(drugsGansuEntity drugsGansuEntity) throws Exception {
		return drugsGansuEntityMapper.insert(drugsGansuEntity) > 0;
	}
}