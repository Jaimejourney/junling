package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsBeijingChineseEntityMapper;
import com.junling.mis.model.primary.drugsBeijingChineseEntity;
import com.junling.mis.service.primary.DrugsBeijingChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsBeijingChineseService")
public class DrugsBeijingChineseServiceImpl implements DrugsBeijingChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsBeijingChineseServiceImpl.class);

	@Resource
	private drugsBeijingChineseEntityMapper drugsBeijingChineseEntityMapper;


	@Override
	public Boolean addDrugsBeijingChinese(drugsBeijingChineseEntity drugsBeijingChineseEntity) throws Exception {
		return drugsBeijingChineseEntityMapper.insert(drugsBeijingChineseEntity) > 0;
	}
}