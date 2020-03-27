package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsNingxiaChineseEntityMapper;
import com.junling.mis.model.primary.drugsNingxiaChineseEntity;
import com.junling.mis.service.primary.DrugsNingxiaChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsNingxiaChineseService")
public class DrugsNingxiaChineseServiceImpl implements DrugsNingxiaChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsNingxiaChineseServiceImpl.class);

	@Resource
	private drugsNingxiaChineseEntityMapper drugsNingxiaChineseEntityMapper;

	@Override
	public Boolean addDrugsNingxiaChinese(drugsNingxiaChineseEntity drugsNingxiaChineseEntity) throws Exception {
		return drugsNingxiaChineseEntityMapper.insert(drugsNingxiaChineseEntity) >0;
	}
}