package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsHeilongjiangChineseEntityMapper;
import com.junling.mis.model.primary.drugsHeilongjiangChineseEntity;
import com.junling.mis.service.primary.DrugsHeilongjiangChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsHeilongjiangChineseService")
public class DrugsHeilongjiangChineseServiceImpl implements DrugsHeilongjiangChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsHeilongjiangChineseServiceImpl.class);

	@Resource
	private drugsHeilongjiangChineseEntityMapper drugsHeilongjiangChineseEntityMapper;


	@Override
	public Boolean addDrugsHeilongjiangChinese(drugsHeilongjiangChineseEntity drugsHeilongjiangChineseEntity) throws Exception {
		return drugsHeilongjiangChineseEntityMapper.insert(drugsHeilongjiangChineseEntity) > 0;
	}
}