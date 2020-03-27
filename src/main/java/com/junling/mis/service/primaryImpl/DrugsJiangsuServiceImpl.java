package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsJiangsuEntityMapper;
import com.junling.mis.model.primary.drugsJiangsuEntity;
import com.junling.mis.service.primary.DrugsJiangsuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsJiangsuService")
public class DrugsJiangsuServiceImpl implements DrugsJiangsuService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsJiangsuServiceImpl.class);

	@Resource
	private drugsJiangsuEntityMapper drugsJiangsuEntityMapper;


	@Override
	public Boolean addDrugsJiangsu(drugsJiangsuEntity drugsJiangsuEntity) throws Exception {
		return drugsJiangsuEntityMapper.insert(drugsJiangsuEntity) > 0;
	}
}