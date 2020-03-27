package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsJiangsuChineseEntityMapper;
import com.junling.mis.model.primary.drugsJiangsuChineseEntity;
import com.junling.mis.service.primary.DrugsJiangsuChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsJiangsuChineseService")
public class DrugsJiangsuChineseServiceImpl implements DrugsJiangsuChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsJiangsuChineseServiceImpl.class);

	@Resource
	private drugsJiangsuChineseEntityMapper drugsJiangsuChineseEntityMapper;


	@Override
	public Boolean addDrugsJiangsuChinese(drugsJiangsuChineseEntity drugsJiangsuChineseEntity) throws Exception {
		return drugsJiangsuChineseEntityMapper.insert(drugsJiangsuChineseEntity) > 0;
	}
}