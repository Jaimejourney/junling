package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsJilinEntityMapper;
import com.junling.mis.model.primary.drugsJilinEntity;
import com.junling.mis.service.primary.DrugsJilinService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsJilinService")
public class DrugsJilinServiceImpl implements DrugsJilinService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsJilinServiceImpl.class);

	@Resource
	private drugsJilinEntityMapper drugsJilinEntityMapper;


	@Override
	public Boolean addDrugsJilin(drugsJilinEntity drugsJilinEntity) throws Exception {
		return drugsJilinEntityMapper.insert(drugsJilinEntity) > 0;
	}
}