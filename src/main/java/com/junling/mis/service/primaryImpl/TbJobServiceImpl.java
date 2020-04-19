package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.TbJobMapper;
import com.junling.mis.model.primary.TbJob;
import com.junling.mis.service.primary.TbJobService;
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
	private TbJobMapper tbJobMapper;

	@Override
	public Boolean addTbJob(TbJob tbJob) throws Exception {
		return tbJobMapper.insert(tbJob)>0;
	}

	@Override
	public Boolean updateTbJob(TbJob tbJob) throws Exception {
		return tbJobMapper.updateByPrimaryKey(tbJob)>0;
	}

	@Override
	public TbJob findDetailTbJob(String jobCode) throws Exception {
		return tbJobMapper.selectByPrimaryKey(jobCode);
	}

	@Override
	public Boolean deleteTbJob(String jobCode) throws Exception {
		return tbJobMapper.deleteByPrimaryKey(jobCode)>0 ;
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