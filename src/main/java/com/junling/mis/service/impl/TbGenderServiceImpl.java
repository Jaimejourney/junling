package com.junling.mis.service.impl;

import com.junling.mis.mapper.tbGenderEntityMapper;
import com.junling.mis.model.tbGenderEntity;
import com.junling.mis.service.TbGenderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbGenderService")
public class TbGenderServiceImpl implements TbGenderService {

	private final static Logger LOG = LoggerFactory.getLogger(TbGenderServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.tbGenderEntityMapper tbGenderEntityMapper;

	@Override
	public Boolean addTbGender(tbGenderEntity tbGenderEntity) throws Exception {
		return tbGenderEntityMapper.insert(tbGenderEntity)>0;
	}

	@Override
	public Boolean updateTbGender(tbGenderEntity tbGenderEntity) throws Exception {
		return tbGenderEntityMapper.updateByPrimaryKey(tbGenderEntity)>0;
	}

	@Override
	public tbGenderEntity findDetailTbGender(String genderCode) throws Exception {
		return tbGenderEntityMapper.selectByPrimaryKey(genderCode);
	}

	@Override
	public Boolean deleteTbGender(String genderCode) throws Exception {
		return tbGenderEntityMapper.deleteByPrimaryKey(genderCode)>0;
	}

//	@Override
//	public Result addTbGender(TbGenderModel tbGenderModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbGender(TbGenderModel tbGenderModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbGender(TbGenderModel tbGenderModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbGender(TbGenderModel tbGenderModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbGenderPage(TbGenderModel tbGenderModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbGender(TbGenderModel tbGenderModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbGender(TbGenderModel tbGenderModel) throws Exception{
//		return null;
//	}

}