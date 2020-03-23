package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsSichuanEntityMapper;
import com.junling.mis.model.drugsSichuanEntity;
import com.junling.mis.service.DrugsSichuanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("drugsSichuanService")
public class DrugsSichuanServiceImpl implements DrugsSichuanService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsSichuanServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.drugsSichuanEntityMapper drugsSichuanEntityMapper;


	@Override
	public Boolean addDrugsSichuan(drugsSichuanEntity drugsSichuanEntity) throws Exception {
		return drugsSichuanEntityMapper.insert(drugsSichuanEntity)>0;
	}
}