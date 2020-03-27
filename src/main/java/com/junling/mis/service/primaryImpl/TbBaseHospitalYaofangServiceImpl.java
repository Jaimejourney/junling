package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.tbBaseHospitalYaofangEntityWithBLOBs;
import com.junling.mis.service.primary.TbBaseHospitalYaofangService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbBaseHospitalYaofangService")
public class TbBaseHospitalYaofangServiceImpl implements TbBaseHospitalYaofangService {

	private final static Logger LOG = LoggerFactory.getLogger(TbBaseHospitalYaofangServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.tbBaseHospitalYaofangEntityMapper tbBaseHospitalYaofangEntityMapper;

	@Override
	public Boolean addTbBaseHospitalYaofang(tbBaseHospitalYaofangEntityWithBLOBs tbBaseHospitalYaofangEntityWithBLOBs) throws Exception {
		return tbBaseHospitalYaofangEntityMapper.insert(tbBaseHospitalYaofangEntityWithBLOBs)>0;
	}

	@Override
	public Boolean updateTbBaseHospitalYaofang(tbBaseHospitalYaofangEntityWithBLOBs tbBaseHospitalYaofangEntityWithBLOBs) throws Exception {
		return tbBaseHospitalYaofangEntityMapper.updateByPrimaryKey(tbBaseHospitalYaofangEntityWithBLOBs)>0;
	}

	@Override
	public tbBaseHospitalYaofangEntityWithBLOBs findDetailTbBaseHospitalYaofang(String hospitalId) throws Exception {
		return tbBaseHospitalYaofangEntityMapper.selectByPrimaryKey(hospitalId);
	}

	@Override
	public Boolean deleteTbBaseHospitalYaofang(String hospitalId) throws Exception {
		return tbBaseHospitalYaofangEntityMapper.deleteByPrimaryKey(hospitalId)>0;
	}


//	@Override
//	public Result addTbBaseHospitalYaofang(TbBaseHospitalYaofangModel tbBaseHospitalYaofangModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbBaseHospitalYaofang(TbBaseHospitalYaofangModel tbBaseHospitalYaofangModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbBaseHospitalYaofang(TbBaseHospitalYaofangModel tbBaseHospitalYaofangModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbBaseHospitalYaofang(TbBaseHospitalYaofangModel tbBaseHospitalYaofangModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbBaseHospitalYaofangPage(TbBaseHospitalYaofangModel tbBaseHospitalYaofangModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbBaseHospitalYaofang(TbBaseHospitalYaofangModel tbBaseHospitalYaofangModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbBaseHospitalYaofang(TbBaseHospitalYaofangModel tbBaseHospitalYaofangModel) throws Exception{
//		return null;
//	}

}