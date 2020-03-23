package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsXizangEntityMapper;
import com.junling.mis.model.drugsXizangEntity;
import com.junling.mis.service.DrugsXizangService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsXizangService")
public class DrugsXizangServiceImpl implements DrugsXizangService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsXizangServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.drugsXizangEntityMapper drugsXizangEntityMapper;

	@Override
	public Boolean addDrugsXizang(drugsXizangEntity drugsXizangEntity) throws Exception {
		return drugsXizangEntityMapper.insert(drugsXizangEntity) > 0;
	}
}