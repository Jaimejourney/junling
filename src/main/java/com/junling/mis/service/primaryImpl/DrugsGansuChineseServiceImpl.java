package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsGansuChineseEntityMapper;
import com.junling.mis.model.primary.drugsGansuChineseEntity;
import com.junling.mis.service.primary.DrugsGansuChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsGansuChineseService")
public class DrugsGansuChineseServiceImpl implements DrugsGansuChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsGansuChineseServiceImpl.class);

	@Resource
	private drugsGansuChineseEntityMapper drugsGansuChineseEntityMapper;


	@Override
	public Boolean addDrugsGansuChinese(drugsGansuChineseEntity drugsGansuChineseEntity) throws Exception {
		return drugsGansuChineseEntityMapper.insert(drugsGansuChineseEntity) > 0;
	}
}