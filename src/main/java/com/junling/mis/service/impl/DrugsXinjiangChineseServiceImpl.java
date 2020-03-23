package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsXinjiangChineseEntityMapper;
import com.junling.mis.model.drugsXinjiangChineseEntity;
import com.junling.mis.service.DrugsXinjiangChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsXinjiangChineseService")
public class DrugsXinjiangChineseServiceImpl implements DrugsXinjiangChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsXinjiangChineseServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.drugsXinjiangChineseEntityMapper drugsXinjiangChineseEntityMapper;


	@Override
	public Boolean addDrugsXinjiangChinese(drugsXinjiangChineseEntity drugsXinjiangChineseEntity) throws Exception {
		return drugsXinjiangChineseEntityMapper.insert(drugsXinjiangChineseEntity)>0;
	}
}