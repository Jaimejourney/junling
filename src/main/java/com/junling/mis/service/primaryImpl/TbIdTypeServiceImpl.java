package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.TbIdTypeMapper;
import com.junling.mis.model.primary.TbIdType;
import com.junling.mis.service.primary.TbIdTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbIdTypeService")
public class TbIdTypeServiceImpl implements TbIdTypeService {

	private final static Logger LOG = LoggerFactory.getLogger(TbIdTypeServiceImpl.class);

	@Resource
	private TbIdTypeMapper tbIdTypeMapper;

	@Override
	public Boolean addTbIdType(TbIdType tbIdType) throws Exception {
		return tbIdTypeMapper.insert(tbIdType)>0;
	}

	@Override
	public Boolean updateTbIdType(TbIdType tbIdType) throws Exception {
		return tbIdTypeMapper.updateByPrimaryKey(tbIdType)>0;
	}

	@Override
	public TbIdType findDetailTbIdType(String idTypeCode) throws Exception {
		return tbIdTypeMapper.selectByPrimaryKey(idTypeCode);
	}

	@Override
	public Boolean deleteTbIdType(String idTypeCode) throws Exception {
		return tbIdTypeMapper.deleteByPrimaryKey(idTypeCode)>0;
	}

//	@Override
//	public Result addTbIdType(TbIdTypeModel tbIdTypeModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbIdType(TbIdTypeModel tbIdTypeModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbIdType(TbIdTypeModel tbIdTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbIdType(TbIdTypeModel tbIdTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbIdTypePage(TbIdTypeModel tbIdTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbIdType(TbIdTypeModel tbIdTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbIdType(TbIdTypeModel tbIdTypeModel) throws Exception{
//		return null;
//	}

}