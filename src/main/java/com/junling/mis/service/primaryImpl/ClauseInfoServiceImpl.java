package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.clauseInfoMapper;
import com.junling.mis.model.primary.clauseInfo;
import com.junling.mis.service.primary.ClauseInfoService;
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
	private clauseInfoMapper clauseInfoMapper;


	@Override
	public Boolean addClauseInfo(clauseInfo clauseInfo) throws Exception {
		return clauseInfoMapper.insert(clauseInfo) > 0;
	}

	@Override
	public Boolean updateClauseInfo(clauseInfo clauseInfo) throws Exception {
		return clauseInfoMapper.updateByPrimaryKey(clauseInfo) > 0;
	}

	@Override
	public clauseInfo findDetailClauseInfo(String clauseId) throws Exception {
		return clauseInfoMapper.selectByPrimaryKey(clauseId);
	}

	@Override
	public Boolean deleteClauseInfo(String clauseId) throws Exception {
		return clauseInfoMapper.deleteByPrimaryKey(clauseId) > 0;
	}
}