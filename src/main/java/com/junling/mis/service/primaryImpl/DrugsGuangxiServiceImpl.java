package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsGuangxiEntityMapper;
import com.junling.mis.model.primary.drugsGuangxiEntity;
import com.junling.mis.service.primary.DrugsGuangxiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsGuangxiService")
public class DrugsGuangxiServiceImpl implements DrugsGuangxiService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsGuangxiServiceImpl.class);

	@Resource
	private drugsGuangxiEntityMapper drugsGuangxiEntityMapper;


	@Override
	public Boolean addDrugsGuangxi(drugsGuangxiEntity drugsGuangxiEntity) throws Exception {
		return drugsGuangxiEntityMapper.insert(drugsGuangxiEntity) > 0;
	}
}