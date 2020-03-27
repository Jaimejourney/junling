package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.drugsXizangChineseEntity;
import com.junling.mis.service.primary.DrugsXizangChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsXizangChineseService")
public class DrugsXizangChineseServiceImpl implements DrugsXizangChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsXizangChineseServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.drugsXizangChineseEntityMapper drugsXizangChineseEntityMapper;


	@Override
	public Boolean addDrugsXizangChinese(drugsXizangChineseEntity drugsXizangChineseEntity) throws Exception {
		return drugsXizangChineseEntityMapper.insert(drugsXizangChineseEntity) > 0;
	}
}