package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsFujianChineseEntityMapper;
import com.junling.mis.model.primary.drugsFujianChineseEntity;
import com.junling.mis.service.primary.DrugsFujianChineseService;
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