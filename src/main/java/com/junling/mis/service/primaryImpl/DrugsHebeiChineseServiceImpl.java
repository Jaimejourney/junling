package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsHebeiChineseEntityMapper;
import com.junling.mis.model.primary.drugsHebeiChineseEntity;
import com.junling.mis.service.primary.DrugsHebeiChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsHebeiChineseService")
public class DrugsHebeiChineseServiceImpl implements DrugsHebeiChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsHebeiChineseServiceImpl.class);

	@Resource
	private drugsHebeiChineseEntityMapper drugsHebeiChineseEntityMapper;


	@Override
	public Boolean addDrugsHebeiChinese(drugsHebeiChineseEntity drugsHebeiChineseEntity) throws Exception {
		return drugsHebeiChineseEntityMapper.insert(drugsHebeiChineseEntity) > 0;
	}
}