package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.drugsShanxi1ChineseEntity;
import com.junling.mis.service.primary.DrugsShanxi1ChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsShanxi1ChineseService")
public class DrugsShanxi1ChineseServiceImpl implements DrugsShanxi1ChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsShanxi1ChineseServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.drugsShanxi1ChineseEntityMapper drugsShanxi1ChineseEntityMapper;


	@Override
	public Boolean addDrugsShanxi1Chinese(drugsShanxi1ChineseEntity drugsShanxi1ChineseEntity) throws Exception {
		return drugsShanxi1ChineseEntityMapper.insert(drugsShanxi1ChineseEntity)>0;
	}
}