package com.junling.mis.service.impl;

import com.junling.mis.mapper.dutySubInfoEntityMapper;
import com.junling.mis.model.dutySubInfoEntity;
import com.junling.mis.service.DutySubInfoService;
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
	private com.junling.mis.mapper.dutySubInfoEntityMapper dutySubInfoEntityMapper;

	@Override
	public Boolean addDutySubInfo(dutySubInfoEntity dutySubInfoModel) throws Exception {
		return dutySubInfoEntityMapper.insert(dutySubInfoModel) > 0;
	}

	@Override
	public Boolean updateDutySubInfo(dutySubInfoEntity dutySubInfoEntity) throws Exception {
		return dutySubInfoEntityMapper.updateByPrimaryKey(dutySubInfoEntity) > 0;
	}

	@Override
	public dutySubInfoEntity findDetailDutySubInfo(String dutySubId) throws Exception {
		return dutySubInfoEntityMapper.selectByPrimaryKey(dutySubId);
	}

	@Override
	public Boolean deleteDutySubInfo(String dutySubId) throws Exception {
		return dutySubInfoEntityMapper.deleteByPrimaryKey(dutySubId) > 0;
	}
}