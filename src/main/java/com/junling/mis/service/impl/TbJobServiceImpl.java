package com.junling.mis.service.impl;

import com.junling.mis.mapper.tbJobEntityMapper;
import com.junling.mis.model.tbJobEntity;
import com.junling.mis.service.TbJobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbJobService")
public class TbJobServiceImpl implements TbJobService {

	private final static Logger LOG = LoggerFactory.getLogger(TbJobServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.tbJobEntityMapper tbJobEntityMapper;

	@Override
	public Boolean addTbJob(tbJobEntity tbJobEntity) throws Exception {
		return tbJobEntityMapper.insert(tbJobEntity)>0;
	}

	@Override
	public Boolean updateTbJob(tbJobEntity tbJobEntity) throws Exception {
		return tbJobEntityMapper.updateByPrimaryKey(tbJobEntity)>0;
	}

	@Override
	public tbJobEntity findDetailTbJob(String jobCode) throws Exception {
		return tbJobEntityMapper.selectByPrimaryKey(jobCode);
	}

	@Override
	public Boolean deleteTbJob(String jobCode) throws Exception {
		return tbJobEntityMapper.deleteByPrimaryKey(jobCode)>0 ;
	}

//	@Override
//	public Result addTbJob(TbJobModel tbJobModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbJob(TbJobModel tbJobModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbJob(TbJobModel tbJobModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbJob(TbJobModel tbJobModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbJobPage(TbJobModel tbJobModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbJob(TbJobModel tbJobModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbJob(TbJobModel tbJobModel) throws Exception{
//		return null;
//	}

}