package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsJiangxiEntityMapper;
import com.junling.mis.model.primary.drugsJiangxiEntity;
import com.junling.mis.service.primary.DrugsJiangxiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsJiangxiService")
public class DrugsJiangxiServiceImpl implements DrugsJiangxiService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsJiangxiServiceImpl.class);

	@Resource
	private drugsJiangxiEntityMapper drugsJiangxiEntityMapper;

	@Override
	public Boolean addDrugsJiangxi(drugsJiangxiEntity drugsJiangxiEntity) throws Exception {
		return drugsJiangxiEntityMapper.insert(drugsJiangxiEntity) > 0;
	}
}