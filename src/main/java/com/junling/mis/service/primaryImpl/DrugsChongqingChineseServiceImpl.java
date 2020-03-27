package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsChongqingChineseEntityMapper;
import com.junling.mis.model.primary.drugsChongqingChineseEntity;
import com.junling.mis.service.primary.DrugsChongqingChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsChongqingChineseService")
public class DrugsChongqingChineseServiceImpl implements DrugsChongqingChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsChongqingChineseServiceImpl.class);

	@Resource
	private drugsChongqingChineseEntityMapper drugsChongqingChineseEntityMapper;


	@Override
	public Boolean addDrugsChongqingChinese(drugsChongqingChineseEntity drugsChongqingChineseEntity) throws Exception {
		return drugsChongqingChineseEntityMapper.insert(drugsChongqingChineseEntity) > 0;
	}
}