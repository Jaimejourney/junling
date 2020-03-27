package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsHenanEntityMapper;
import com.junling.mis.model.primary.drugsHenanEntity;
import com.junling.mis.service.primary.DrugsHenanService;
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