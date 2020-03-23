package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsGuangdongChineseEntityMapper;
import com.junling.mis.model.drugsGuangdongChineseEntity;
import com.junling.mis.service.DrugsGuangdongChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsGuangdongChineseService")
public class DrugsGuangdongChineseServiceImpl implements DrugsGuangdongChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsGuangdongChineseServiceImpl.class);

	@Resource
	private drugsGuangdongChineseEntityMapper drugsGuangdongChineseEntityMapper;

	@Override
	public Boolean addDrugsGuangdongChinese(drugsGuangdongChineseEntity drugsGuangdongChineseEntity) throws Exception {
		return drugsGuangdongChineseEntityMapper.insert(drugsGuangdongChineseEntity) >0;
	}
}