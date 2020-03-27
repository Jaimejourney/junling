package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsNingxiaEntityMapper;
import com.junling.mis.model.primary.drugsNingxiaEntity;
import com.junling.mis.service.primary.DrugsNingxiaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsNingxiaService")
public class DrugsNingxiaServiceImpl implements DrugsNingxiaService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsNingxiaServiceImpl.class);

	@Resource
	private drugsNingxiaEntityMapper drugsNingxiaEntityMapper;


	@Override
	public Boolean addDrugsNingxia(drugsNingxiaEntity drugsNingxiaEntity) throws Exception {
		return drugsNingxiaEntityMapper.insert(drugsNingxiaEntity) >0;
	}
}