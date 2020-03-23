package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsGuizhouChineseEntityMapper;
import com.junling.mis.model.drugsGuizhouChineseEntity;
import com.junling.mis.service.DrugsGuizhouChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsGuizhouChineseService")
public class DrugsGuizhouChineseServiceImpl implements DrugsGuizhouChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsGuizhouChineseServiceImpl.class);

	@Resource
	private drugsGuizhouChineseEntityMapper drugsGuizhouChineseEntityMapper;


	@Override
	public Boolean addDrugsGuizhouChinese(drugsGuizhouChineseEntity drugsGuizhouChineseEntity) throws Exception {
		return drugsGuizhouChineseEntityMapper.insert(drugsGuizhouChineseEntity) > 0;
	}
}