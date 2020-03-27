package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsAnhuiEntityMapper;
import com.junling.mis.model.primary.drugsAnhuiEntity;
import com.junling.mis.service.primary.DrugsAnhuiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsAnhuiService")
public class DrugsAnhuiServiceImpl implements DrugsAnhuiService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsAnhuiServiceImpl.class);

	@Resource
	private drugsAnhuiEntityMapper drugsAnhuiEntityMapper;


	@Override
	public Boolean addDrugsAnhui(drugsAnhuiEntity drugsAnhuiEntity) throws Exception {
		return drugsAnhuiEntityMapper.insert(drugsAnhuiEntity) > 0;
	}
}