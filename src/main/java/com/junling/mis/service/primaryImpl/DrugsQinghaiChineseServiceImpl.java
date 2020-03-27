package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsQinghaiChineseEntityMapper;
import com.junling.mis.model.primary.drugsQinghaiChineseEntity;
import com.junling.mis.service.primary.DrugsQinghaiChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsQinghaiChineseService")
public class DrugsQinghaiChineseServiceImpl implements DrugsQinghaiChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsQinghaiChineseServiceImpl.class);

	@Resource
	private drugsQinghaiChineseEntityMapper drugsQinghaiChineseEntityMapper;


	@Override
	public Boolean addDrugsQinghaiChinese(drugsQinghaiChineseEntity drugsQinghaiChineseEntity) throws Exception {
		return drugsQinghaiChineseEntityMapper.insert(drugsQinghaiChineseEntity) > 0;
	}
}