package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.drugsYunnanChineseEntity;
import com.junling.mis.service.primary.DrugsYunnanChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsYunnanChineseService")
public class DrugsYunnanChineseServiceImpl implements DrugsYunnanChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsYunnanChineseServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.drugsYunnanChineseEntityMapper drugsYunnanChineseEntityMapper;


	@Override
	public Boolean addDrugsYunnanChinese(drugsYunnanChineseEntity drugsYunnanChineseEntity) throws Exception {
		return drugsYunnanChineseEntityMapper.insert(drugsYunnanChineseEntity) > 0;
	}
}