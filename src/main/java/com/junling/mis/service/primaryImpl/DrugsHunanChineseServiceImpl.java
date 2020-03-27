package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsHunanChineseEntityMapper;
import com.junling.mis.model.primary.drugsHunanChineseEntity;
import com.junling.mis.service.primary.DrugsHunanChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsHunanChineseService")
public class DrugsHunanChineseServiceImpl implements DrugsHunanChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsHunanChineseServiceImpl.class);

	@Resource
	private drugsHunanChineseEntityMapper drugsHunanChineseEntityMapper;


	@Override
	public Boolean addDrugsHunanChinese(drugsHunanChineseEntity drugsHunanChineseEntity) throws Exception {
		return drugsHunanChineseEntityMapper.insert(drugsHunanChineseEntity) > 0;
	}
}