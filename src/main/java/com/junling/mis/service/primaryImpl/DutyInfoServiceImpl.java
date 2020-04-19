package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.DutyInfoMapper;
import com.junling.mis.model.primary.DutyInfo;
import com.junling.mis.service.primary.DutyInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("dutyInfoService")
public class DutyInfoServiceImpl implements DutyInfoService {

	private final static Logger LOG = LoggerFactory.getLogger(DutyInfoServiceImpl.class);

	@Resource
	private DutyInfoMapper dutyInfoMapper;

	@Override
	public Boolean addDutyInfo(DutyInfo dutyInfo) throws Exception {
		return dutyInfoMapper.insert(dutyInfo) > 0;
	}

	@Override
	public Boolean updateDutyInfo(DutyInfo dutyInfo) throws Exception {
		return dutyInfoMapper.updateByPrimaryKey(dutyInfo) > 0;
	}

	@Override
	public DutyInfo findDetailDutyInfo(String dutyId) throws Exception {
		return dutyInfoMapper.selectByPrimaryKey(dutyId);
	}

	@Override
	public Boolean deleteDutyInfo(String dutyId) throws Exception {
		return dutyInfoMapper.deleteByPrimaryKey(dutyId) > 0;
	}

//	@Override
//	public Result addDutyInfo(DutyInfoModel dutyInfoModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateDutyInfo(DutyInfoModel dutyInfoModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailDutyInfo(DutyInfoModel dutyInfoModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listDutyInfo(DutyInfoModel dutyInfoModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listDutyInfoPage(DutyInfoModel dutyInfoModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countDutyInfo(DutyInfoModel dutyInfoModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteDutyInfo(DutyInfoModel dutyInfoModel) throws Exception{
//		return null;
//	}

}