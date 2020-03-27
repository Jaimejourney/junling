package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsGuangdongEntityMapper;
import com.junling.mis.model.primary.drugsGuangdongEntity;
import com.junling.mis.service.primary.DrugsGuangdongService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsGuangdongService")
public class DrugsGuangdongServiceImpl implements DrugsGuangdongService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsGuangdongServiceImpl.class);

	@Resource
	private drugsGuangdongEntityMapper drugsGuangdongEntityMapper;


	@Override
	public Boolean addDrugsGuangdong(drugsGuangdongEntity drugsGuangdongEntity) throws Exception {
		return drugsGuangdongEntityMapper.insert(drugsGuangdongEntity) > 0;
	}
}