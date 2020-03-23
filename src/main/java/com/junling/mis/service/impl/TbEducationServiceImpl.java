package com.junling.mis.service.impl;

import com.junling.mis.mapper.tbEducationEntityMapper;
import com.junling.mis.model.tbEducationEntity;
import com.junling.mis.service.TbEducationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbEducationService")
public class TbEducationServiceImpl implements TbEducationService {

	private final static Logger LOG = LoggerFactory.getLogger(TbEducationServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.tbEducationEntityMapper tbEducationEntityMapper;

	@Override
	public Boolean addTbEducation(tbEducationEntity tbEducationEntity) throws Exception {
		return tbEducationEntityMapper.insert(tbEducationEntity)>0;
	}

	@Override
	public Boolean updateTbEducation(tbEducationEntity tbEducationEntity) throws Exception {
		return tbEducationEntityMapper.updateByPrimaryKey(tbEducationEntity)>0;
	}

	@Override
	public tbEducationEntity findDetailTbEducation(String educationCode) throws Exception {
		return tbEducationEntityMapper.selectByPrimaryKey(educationCode);
	}

	@Override
	public Boolean deleteTbEducation(String educationCode) throws Exception {
		return tbEducationEntityMapper.deleteByPrimaryKey(educationCode)>0;
	}

//	@Override
//	public Result addTbEducation(TbEducationModel tbEducationModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbEducation(TbEducationModel tbEducationModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbEducation(TbEducationModel tbEducationModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbEducation(TbEducationModel tbEducationModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbEducationPage(TbEducationModel tbEducationModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbEducation(TbEducationModel tbEducationModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbEducation(TbEducationModel tbEducationModel) throws Exception{
//		return null;
//	}

}