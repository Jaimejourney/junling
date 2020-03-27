package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsJilinChineseEntityMapper;
import com.junling.mis.model.primary.drugsJilinChineseEntity;
import com.junling.mis.service.primary.DrugsJilinChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsJilinChineseService")
public class DrugsJilinChineseServiceImpl implements DrugsJilinChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsJilinChineseServiceImpl.class);

	@Resource
	private drugsJilinChineseEntityMapper drugsJilinChineseEntityMapper;


	@Override
	public Boolean addDrugsJilinChinese(drugsJilinChineseEntity drugsJilinChineseEntity) throws Exception {
		return drugsJilinChineseEntityMapper.insert(drugsJilinChineseEntity) > 0;
	}
}