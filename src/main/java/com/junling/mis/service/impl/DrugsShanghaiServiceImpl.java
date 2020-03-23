package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsShanghaiEntityMapper;
import com.junling.mis.model.drugsShanghaiEntity;
import com.junling.mis.service.DrugsShanghaiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsShanghaiService")
public class DrugsShanghaiServiceImpl implements DrugsShanghaiService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsShanghaiServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.drugsShanghaiEntityMapper drugsShanghaiEntityMapper;


	@Override
	public Boolean addDrugsShanghai(drugsShanghaiEntity drugsShanghaiEntity) throws Exception {
		return drugsShanghaiEntityMapper.insert(drugsShanghaiEntity) > 0;
	}
}