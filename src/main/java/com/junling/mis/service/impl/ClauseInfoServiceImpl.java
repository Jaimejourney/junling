package com.junling.mis.service.impl;

import com.junling.mis.mapper.clauseInfoEntityMapper;
import com.junling.mis.model.claimInfoEntity;
import com.junling.mis.model.clauseInfoEntity;
import com.junling.mis.service.ClauseInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("clauseInfoService")
public class ClauseInfoServiceImpl implements ClauseInfoService {

	private final static Logger LOG = LoggerFactory.getLogger(ClauseInfoServiceImpl.class);

	@Resource
	private clauseInfoEntityMapper clauseInfoEntityMapper;


	@Override
	public Boolean addClauseInfo(clauseInfoEntity clauseInfoEntity) throws Exception {
		return clauseInfoEntityMapper.insert(clauseInfoEntity) > 0;
	}

	@Override
	public Boolean updateClauseInfo(clauseInfoEntity clauseInfoEntity) throws Exception {
		return clauseInfoEntityMapper.updateByPrimaryKey(clauseInfoEntity) > 0;
	}

	@Override
	public clauseInfoEntity findDetailClauseInfo(String clauseId) throws Exception {
		return clauseInfoEntityMapper.selectByPrimaryKey(clauseId);
	}

	@Override
	public Boolean deleteClauseInfo(String clauseId) throws Exception {
		return clauseInfoEntityMapper.deleteByPrimaryKey(clauseId) > 0;
	}
}