package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsZhejiangEntityMapper;
import com.junling.mis.model.drugsZhejiangEntity;
import com.junling.mis.service.DrugsZhejiangService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsZhejiangService")
public class DrugsZhejiangServiceImpl implements DrugsZhejiangService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsZhejiangServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.drugsZhejiangEntityMapper drugsZhejiangEntityMapper;


	@Override
	public Boolean addDrugsZhejiang(drugsZhejiangEntity drugsZhejiangEntity) throws Exception {
		return drugsZhejiangEntityMapper.insert(drugsZhejiangEntity) > 0;
	}
}