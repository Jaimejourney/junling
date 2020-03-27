package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugsFujianEntityMapper;
import com.junling.mis.model.primary.drugsFujianEntity;
import com.junling.mis.service.primary.DrugsFujianService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsFujianService")
public class DrugsFujianServiceImpl implements DrugsFujianService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsFujianServiceImpl.class);

	@Resource
	private drugsFujianEntityMapper drugsFujianEntityMapper;


	@Override
	public Boolean addDrugsFujian(drugsFujianEntity drugsFujianEntity) throws Exception {
		return drugsFujianEntityMapper.insert(drugsFujianEntity) > 0;
	}
}