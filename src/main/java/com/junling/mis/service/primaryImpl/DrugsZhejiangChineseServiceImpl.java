package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.drugsZhejiangChineseEntity;
import com.junling.mis.service.primary.DrugsZhejiangChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsZhejiangChineseService")
public class DrugsZhejiangChineseServiceImpl implements DrugsZhejiangChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsZhejiangChineseServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.drugsZhejiangChineseEntityMapper drugsZhejiangChineseEntityMapper;


	@Override
	public Boolean addDrugsZhejiangChinese(drugsZhejiangChineseEntity drugsZhejiangChineseEntity) throws Exception {
		return drugsZhejiangChineseEntityMapper.insert(drugsZhejiangChineseEntity) > 0;
	}
}