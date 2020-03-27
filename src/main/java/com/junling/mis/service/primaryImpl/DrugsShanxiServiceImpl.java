package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.drugsShanxiEntity;
import com.junling.mis.service.primary.DrugsShanxiService;
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
	private com.junling.mis.mapper.primary.drugsShanxiEntityMapper drugsShanxiEntityMapper;


	@Override
	public Boolean addDrugsShanxi(drugsShanxiEntity drugsShanxiEntity) throws Exception {
		return drugsShanxiEntityMapper.insert(drugsShanxiEntity)>0;
	}
}