package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsNeimengguEntityMapper;
import com.junling.mis.model.primary.drugsNeimengguEntity;
import com.junling.mis.service.primary.DrugsNeimengguService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsNeimengguService")
public class DrugsNeimengguServiceImpl implements DrugsNeimengguService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsNeimengguServiceImpl.class);

	@Resource
	private drugsNeimengguEntityMapper drugsNeimengguEntityMapper;


	@Override
	public Boolean addDrugsNeimenggu(drugsNeimengguEntity drugsNeimengguEntity) throws Exception {
		return drugsNeimengguEntityMapper.insert(drugsNeimengguEntity) > 0;
	}
}