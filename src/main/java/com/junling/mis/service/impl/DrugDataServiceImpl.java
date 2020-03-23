package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugDataEntityMapper;
import com.junling.mis.model.drugDataEntity;
import com.junling.mis.service.DrugDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugDataService")
public class DrugDataServiceImpl implements DrugDataService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugDataServiceImpl.class);

	@Resource
	private drugDataEntityMapper drugDataEntityMapper;


	@Override
	public Boolean addDrugData(drugDataEntity drugDataEntity) throws Exception {
		return drugDataEntityMapper.insert(drugDataEntity) > 0;
	}
}