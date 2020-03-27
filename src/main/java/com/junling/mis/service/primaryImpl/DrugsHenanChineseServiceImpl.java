package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsHenanChineseEntityMapper;
import com.junling.mis.model.primary.drugsHenanChineseEntity;
import com.junling.mis.service.primary.DrugsHenanChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsHenanChineseService")
public class DrugsHenanChineseServiceImpl implements DrugsHenanChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsHenanChineseServiceImpl.class);

	@Resource
	private drugsHenanChineseEntityMapper drugsHenanChineseEntityMapper;

	@Override
	public Boolean addDrugsHenanChinese(drugsHenanChineseEntity drugsHenanChineseEntity) throws Exception {
		return drugsHenanChineseEntityMapper.insert(drugsHenanChineseEntity) > 0;
	}
}