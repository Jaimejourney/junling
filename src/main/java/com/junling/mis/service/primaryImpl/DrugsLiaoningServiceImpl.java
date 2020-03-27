package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsLiaoingEntityMapper;
import com.junling.mis.model.primary.drugsLiaoningEntity;
import com.junling.mis.service.primary.DrugsLiaoningService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsLiaoningService")
public class DrugsLiaoningServiceImpl implements DrugsLiaoningService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsLiaoningServiceImpl.class);

	@Resource
	private drugsLiaoingEntityMapper drugsLiaoningEntityMapper;


	@Override
	public Boolean addDrugsLiaoning(drugsLiaoningEntity drugsLiaoningEntity) throws Exception {
		return drugsLiaoningEntityMapper.insert(drugsLiaoningEntity) > 0;
	}
}