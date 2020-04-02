package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.tbGender;
import com.junling.mis.service.primary.TbGenderService;
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
	private com.junling.mis.mapper.primary.tbGenderMapper tbGenderMapper;

	@Override
	public Boolean addTbGender(tbGender tbGender) throws Exception {
		return tbGenderMapper.insert(tbGender)>0;
	}

	@Override
	public Boolean updateTbGender(tbGender tbGender) throws Exception {
		return tbGenderMapper.updateByPrimaryKey(tbGender)>0;
	}

	@Override
	public tbGender findDetailTbGender(String genderCode) throws Exception {
		return tbGenderMapper.selectByPrimaryKey(genderCode);
	}

	@Override
	public Boolean deleteTbGender(String genderCode) throws Exception {
		return tbGenderMapper.deleteByPrimaryKey(genderCode)>0;
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