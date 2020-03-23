package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsQinghaiEntityMapper;
import com.junling.mis.model.drugsQinghaiEntity;
import com.junling.mis.service.DrugsQinghaiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsQinghaiService")
public class DrugsQinghaiServiceImpl implements DrugsQinghaiService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsQinghaiServiceImpl.class);

	@Resource
	private drugsQinghaiEntityMapper drugsQinghaiEntityMapper;


	@Override
	public Boolean addDrugsQinghai(drugsQinghaiEntity drugsQinghaiEntity) throws Exception {
		return drugsQinghaiEntityMapper.insert(drugsQinghaiEntity) > 0;
	}
}