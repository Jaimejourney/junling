package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.TbBaseHospitalMapper;
import com.junling.mis.model.primary.TbBaseHospital;
import com.junling.mis.service.primary.TbBaseHospitalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbBaseHospitalService")
public class TbBaseHospitalServiceImpl implements TbBaseHospitalService {

	private final static Logger LOG = LoggerFactory.getLogger(TbBaseHospitalServiceImpl.class);

	@Resource
	private TbBaseHospitalMapper tbBaseHospitalMapper;

	@Override
	public Boolean addTbBaseHospital(TbBaseHospital tbBaseHospital) throws Exception {
		return tbBaseHospitalMapper.insert(tbBaseHospital)>0;
	}

	@Override
	public Boolean updateTbBaseHospital(TbBaseHospital tbBaseHospital) throws Exception {
		return tbBaseHospitalMapper.updateByPrimaryKey(tbBaseHospital)>0;
	}

	@Override
	public TbBaseHospital findDetailTbBaseHospital(String hospitalId) throws Exception {
		return tbBaseHospitalMapper.selectByPrimaryKey(hospitalId);
	}

	@Override
	public Boolean deleteTbBaseHospital(String hospitalId) throws Exception {
		return tbBaseHospitalMapper.deleteByPrimaryKey(hospitalId)>0;
	}


//	@Override
//	public Result addTbBaseHospital(TbBaseHospitalModel tbBaseHospitalModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbBaseHospital(TbBaseHospitalModel tbBaseHospitalModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbBaseHospital(TbBaseHospitalModel tbBaseHospitalModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbBaseHospital(TbBaseHospitalModel tbBaseHospitalModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbBaseHospitalPage(TbBaseHospitalModel tbBaseHospitalModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbBaseHospital(TbBaseHospitalModel tbBaseHospitalModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbBaseHospital(TbBaseHospitalModel tbBaseHospitalModel) throws Exception{
//		return null;
//	}

}