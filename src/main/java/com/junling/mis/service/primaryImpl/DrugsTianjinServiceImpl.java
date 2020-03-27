package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.drugsTianjinEntity;
import com.junling.mis.service.primary.DrugsTianjinService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("drugsTianjinService")
public class DrugsTianjinServiceImpl implements DrugsTianjinService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsTianjinServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.drugsTianjinEntityMapper drugsTianjinEntityMapper;

	@Override
	public Boolean addDrugsTianjin(drugsTianjinEntity drugsTianjinEntity) throws Exception {
		return drugsTianjinEntityMapper.insert(drugsTianjinEntity) > 0;
	}

//	@Override
//	public Result addDrugsTianjin(DrugsTianjinModel drugsTianjinModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateDrugsTianjin(DrugsTianjinModel drugsTianjinModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailDrugsTianjin(DrugsTianjinModel drugsTianjinModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listDrugsTianjin(DrugsTianjinModel drugsTianjinModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listDrugsTianjinPage(DrugsTianjinModel drugsTianjinModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countDrugsTianjin(DrugsTianjinModel drugsTianjinModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteDrugsTianjin(DrugsTianjinModel drugsTianjinModel) throws Exception{
//		return null;
//	}

}