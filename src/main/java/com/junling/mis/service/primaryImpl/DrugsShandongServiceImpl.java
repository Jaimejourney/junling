package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.drugsShandongEntity;
import com.junling.mis.service.primary.DrugsShandongService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsShandongService")
public class DrugsShandongServiceImpl implements DrugsShandongService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsShandongServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.drugsShandongEntityMapper drugsShandongEntityMapper;


	@Override
	public Boolean addDrugsShandong(drugsShandongEntity drugsShandongEntity) throws Exception {
		return drugsShandongEntityMapper.insert(drugsShandongEntity) > 0;
	}
}