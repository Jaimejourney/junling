package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsCopyEntityMapper;
import com.junling.mis.model.drugsCopyEntity;
import com.junling.mis.service.DrugsCopyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsCopyService")
public class DrugsCopyServiceImpl implements DrugsCopyService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsCopyServiceImpl.class);

	@Resource
	private drugsCopyEntityMapper drugsCopyEntityMapper;


	@Override
	public Boolean addDrugsCopy(drugsCopyEntity drugsCopyEntity) throws Exception {
		return drugsCopyEntityMapper.insert(drugsCopyEntity) > 0;
	}
}