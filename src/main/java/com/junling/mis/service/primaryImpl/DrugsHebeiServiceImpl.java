package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsHebeiEntityMapper;
import com.junling.mis.model.primary.drugsHebeiEntity;
import com.junling.mis.service.primary.DrugsHebeiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsHebeiService")
public class DrugsHebeiServiceImpl implements DrugsHebeiService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsHebeiServiceImpl.class);

	@Resource
	private drugsHebeiEntityMapper drugsHebeiEntityMapper;


	@Override
	public Boolean addDrugsHebei(drugsHebeiEntity drugsHebeiEntity) throws Exception {
		return drugsHebeiEntityMapper.insert(drugsHebeiEntity) > 0;
	}
}