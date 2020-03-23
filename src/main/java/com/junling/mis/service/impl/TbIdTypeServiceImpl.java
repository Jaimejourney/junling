package com.junling.mis.service.impl;

import com.junling.mis.mapper.tbIdTypeEntityMapper;
import com.junling.mis.model.tbIdTypeEntity;
import com.junling.mis.service.TbIdTypeService;
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
	private com.junling.mis.mapper.tbIdTypeEntityMapper tbIdTypeEntityMapper;

	@Override
	public Boolean addTbIdType(tbIdTypeEntity tbIdTypeEntity) throws Exception {
		return tbIdTypeEntityMapper.insert(tbIdTypeEntity)>0;
	}

	@Override
	public Boolean updateTbIdType(tbIdTypeEntity tbIdTypeEntity) throws Exception {
		return tbIdTypeEntityMapper.updateByPrimaryKey(tbIdTypeEntity)>0;
	}

	@Override
	public tbIdTypeEntity findDetailTbIdType(String idTypeCode) throws Exception {
		return tbIdTypeEntityMapper.selectByPrimaryKey(idTypeCode);
	}

	@Override
	public Boolean deleteTbIdType(String idTypeCode) throws Exception {
		return tbIdTypeEntityMapper.deleteByPrimaryKey(idTypeCode)>0;
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