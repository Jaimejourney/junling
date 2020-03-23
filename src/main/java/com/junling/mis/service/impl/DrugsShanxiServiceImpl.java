package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsShanxiEntityMapper;
import com.junling.mis.model.drugsShanxiEntity;
import com.junling.mis.service.DrugsShanxiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsShanxiService")
public class DrugsShanxiServiceImpl implements DrugsShanxiService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsShanxiServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.drugsShanxiEntityMapper drugsShanxiEntityMapper;


	@Override
	public Boolean addDrugsShanxi(drugsShanxiEntity drugsShanxiEntity) throws Exception {
		return drugsShanxiEntityMapper.insert(drugsShanxiEntity)>0;
	}
}