package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.drugsShanghaiChineseEntity;
import com.junling.mis.service.primary.DrugsShanghaiChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsShanghaiChineseService")
public class DrugsShanghaiChineseServiceImpl implements DrugsShanghaiChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsShanghaiChineseServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.drugsShanghaiChineseEntityMapper drugsShanghaiChineseEntityMapper;


	@Override
	public Boolean addDrugsShanghaiChinese(drugsShanghaiChineseEntity drugsShanghaiChineseEntity) throws Exception {
		return drugsShanghaiChineseEntityMapper.insert(drugsShanghaiChineseEntity) > 0;
	}
}