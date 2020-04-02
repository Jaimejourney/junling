package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.dutySubInfo;
import com.junling.mis.service.primary.DutySubInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("dutySubInfoService")
public class DutySubInfoServiceImpl implements DutySubInfoService {

	private final static Logger LOG = LoggerFactory.getLogger(DutySubInfoServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.dutySubInfoMapper dutySubInfoMapper;

	@Override
	public Boolean addDutySubInfo(dutySubInfo dutySubInfoModel) throws Exception {
		return dutySubInfoMapper.insert(dutySubInfoModel) > 0;
	}

	@Override
	public Boolean updateDutySubInfo(dutySubInfo dutySubInfo) throws Exception {
		return dutySubInfoMapper.updateByPrimaryKey(dutySubInfo) > 0;
	}

	@Override
	public dutySubInfo findDetailDutySubInfo(String dutySubId) throws Exception {
		return dutySubInfoMapper.selectByPrimaryKey(dutySubId);
	}

	@Override
	public Boolean deleteDutySubInfo(String dutySubId) throws Exception {
		return dutySubInfoMapper.deleteByPrimaryKey(dutySubId) > 0;
	}
}