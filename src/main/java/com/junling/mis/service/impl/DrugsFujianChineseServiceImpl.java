package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsFujianChineseEntityMapper;
import com.junling.mis.model.drugsFujianChineseEntity;
import com.junling.mis.service.DrugsFujianChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsFujianChineseService")
public class DrugsFujianChineseServiceImpl implements DrugsFujianChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsFujianChineseServiceImpl.class);

	@Resource
	private drugsFujianChineseEntityMapper drugsFujianChineseEntityMapper;


	@Override
	public Boolean addDrugsFujianChinese(drugsFujianChineseEntity drugsFujianChineseEntity) throws Exception {
		return drugsFujianChineseEntityMapper.insert(drugsFujianChineseEntity) > 0;
	}
}