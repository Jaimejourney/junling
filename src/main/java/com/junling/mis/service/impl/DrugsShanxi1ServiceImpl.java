package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsShanxi1EntityMapper;
import com.junling.mis.model.drugsShanxi1Entity;
import com.junling.mis.service.DrugsShanxi1Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsShanxi1Service")
public class DrugsShanxi1ServiceImpl implements DrugsShanxi1Service {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsShanxi1ServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.drugsShanxi1EntityMapper drugsShanxi1EntityMapper;

	@Override
	public Boolean addDrugsShanxi1(drugsShanxi1Entity drugsShanxi1Entity) throws Exception {
		return drugsShanxi1EntityMapper.insert(drugsShanxi1Entity) > 0;
	}
}