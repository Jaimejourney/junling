package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.drugDataCopyEntityMapper;
import com.junling.mis.model.primary.drugDataCopyEntity;
import com.junling.mis.service.primary.DrugDataCopyService;
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