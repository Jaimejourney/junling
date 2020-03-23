package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsZhejiangChineseEntityMapper;
import com.junling.mis.model.drugsZhejiangChineseEntity;
import com.junling.mis.service.DrugsZhejiangChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsZhejiangChineseService")
public class DrugsZhejiangChineseServiceImpl implements DrugsZhejiangChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsZhejiangChineseServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.drugsZhejiangChineseEntityMapper drugsZhejiangChineseEntityMapper;


	@Override
	public Boolean addDrugsZhejiangChinese(drugsZhejiangChineseEntity drugsZhejiangChineseEntity) throws Exception {
		return drugsZhejiangChineseEntityMapper.insert(drugsZhejiangChineseEntity) > 0;
	}
}