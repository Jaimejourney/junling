package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.TbAccidentTypeMapper;
import com.junling.mis.model.primary.TbAccidentType;
import com.junling.mis.service.primary.TbAccidentTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbAccidentTypeService")
public class TbAccidentTypeServiceImpl implements TbAccidentTypeService {

	private final static Logger LOG = LoggerFactory.getLogger(TbAccidentTypeServiceImpl.class);

	@Resource
	private TbAccidentTypeMapper tbAccidentTypeMapper;

	@Override
	public Boolean addTbAccidentType(TbAccidentType tbAccidentType) throws Exception {
		return tbAccidentTypeMapper.insert(tbAccidentType)>0;
	}

	@Override
	public Boolean updateTbAccidentType(TbAccidentType tbAccidentType) throws Exception {
		return tbAccidentTypeMapper.updateByPrimaryKey(tbAccidentType)>0;
	}

	@Override
	public TbAccidentType findDetailTbAccidentType(String accidentTypeCode) throws Exception {
		return tbAccidentTypeMapper.selectByPrimaryKey(accidentTypeCode);
	}

	@Override
	public Boolean deleteTbAccidentType(String accidentTypeCode) throws Exception {
		return tbAccidentTypeMapper.deleteByPrimaryKey(accidentTypeCode)>0;
	}

//	@Override
//	public Result addTbAccidentType(TbAccidentTypeModel tbAccidentTypeModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbAccidentType(TbAccidentTypeModel tbAccidentTypeModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbAccidentType(TbAccidentTypeModel tbAccidentTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbAccidentType(TbAccidentTypeModel tbAccidentTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbAccidentTypePage(TbAccidentTypeModel tbAccidentTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbAccidentType(TbAccidentTypeModel tbAccidentTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbAccidentType(TbAccidentTypeModel tbAccidentTypeModel) throws Exception{
//		return null;
//	}

}