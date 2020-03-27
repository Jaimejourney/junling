package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.tbRelationHospitalEntity;
import com.junling.mis.service.primary.TbRelationHospitalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbRelationHospitalService")
public class TbRelationHospitalServiceImpl implements TbRelationHospitalService {

	private final static Logger LOG = LoggerFactory.getLogger(TbRelationHospitalServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.tbRelationHospitalEntityMapper tbRelationHospitalEntityMapper;

	@Override
	public Boolean addTbRelationHospital(tbRelationHospitalEntity tbRelationHospitalEntity) throws Exception {
		return tbRelationHospitalEntityMapper.insert(tbRelationHospitalEntity)>0;
	}

//	@Override
//	public Result addTbRelationHospital(TbRelationHospitalModel tbRelationHospitalModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbRelationHospital(TbRelationHospitalModel tbRelationHospitalModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbRelationHospital(TbRelationHospitalModel tbRelationHospitalModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbRelationHospital(TbRelationHospitalModel tbRelationHospitalModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbRelationHospitalPage(TbRelationHospitalModel tbRelationHospitalModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbRelationHospital(TbRelationHospitalModel tbRelationHospitalModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbRelationHospital(TbRelationHospitalModel tbRelationHospitalModel) throws Exception{
//		return null;
//	}

}