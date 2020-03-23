package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugDataCopyEntityMapper;
import com.junling.mis.model.drugDataCopyEntity;
import com.junling.mis.service.DrugDataCopyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugDataCopyService")
public class DrugDataCopyServiceImpl implements DrugDataCopyService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugDataCopyServiceImpl.class);

	@Resource
	private drugDataCopyEntityMapper drugDataCopyEntityMapper;


	@Override
	public Boolean addDrugDataCopy(drugDataCopyEntity drugDataCopyEntity) throws Exception {
		return drugDataCopyEntityMapper.insert(drugDataCopyEntity) > 0;
	}
}