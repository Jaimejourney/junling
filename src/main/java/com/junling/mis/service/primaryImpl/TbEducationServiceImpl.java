package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.TbEducationMapper;
import com.junling.mis.model.primary.TbEducation;
import com.junling.mis.service.primary.TbEducationService;
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
	private TbEducationMapper tbEducationMapper;

	@Override
	public Boolean addTbEducation(TbEducation tbEducation) throws Exception {
		return tbEducationMapper.insert(tbEducation)>0;
	}

	@Override
	public Boolean updateTbEducation(TbEducation tbEducation) throws Exception {
		return tbEducationMapper.updateByPrimaryKey(tbEducation)>0;
	}

	@Override
	public TbEducation findDetailTbEducation(String educationCode) throws Exception {
		return tbEducationMapper.selectByPrimaryKey(educationCode);
	}

	@Override
	public Boolean deleteTbEducation(String educationCode) throws Exception {
		return tbEducationMapper.deleteByPrimaryKey(educationCode)>0;
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