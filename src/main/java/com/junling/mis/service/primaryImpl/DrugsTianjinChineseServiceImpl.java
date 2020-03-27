package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.drugsTianjinChineseEntity;
import com.junling.mis.service.primary.DrugsTianjinChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsTianjinChineseService")
public class DrugsTianjinChineseServiceImpl implements DrugsTianjinChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsTianjinChineseServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.drugsTianjinChineseEntityMapper drugsTianjinChineseEntityMapper;


	@Override
	public Boolean addDrugsTianjinChinese(drugsTianjinChineseEntity drugsTianjinChineseEntity) throws Exception {
		return drugsTianjinChineseEntityMapper.insert(drugsTianjinChineseEntity)>0;
	}
}