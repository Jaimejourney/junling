package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.drugsXinjiangEntity;
import com.junling.mis.service.primary.DrugsXinjiangService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsXinjiangService")
public class DrugsXinjiangServiceImpl implements DrugsXinjiangService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsXinjiangServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.drugsXinjiangEntityMapper drugsXinjiangEntityMapper;


	@Override
	public Boolean addDrugsXinjiang(drugsXinjiangEntity drugsXinjiangEntity) throws Exception {
		return drugsXinjiangEntityMapper.insert(drugsXinjiangEntity) > 0;
	}
}