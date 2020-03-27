package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsHeilongjiangEntityMapper;
import com.junling.mis.model.primary.drugsHeilongjiangEntity;
import com.junling.mis.service.primary.DrugsHeilongjiangService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsHeilongjiangService")
public class DrugsHeilongjiangServiceImpl implements DrugsHeilongjiangService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsHeilongjiangServiceImpl.class);

	@Resource
	private drugsHeilongjiangEntityMapper drugsHeilongjiangEntityMapper;


	@Override
	public Boolean addDrugsHeilongjiang(drugsHeilongjiangEntity drugsHeilongjiangEntity) throws Exception {
		return drugsHeilongjiangEntityMapper.insert(drugsHeilongjiangEntity) > 0;
	}
}