package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.TbIcd10Mapper;
import com.junling.mis.model.primary.TbIcd10;
import com.junling.mis.service.primary.TbIcd10Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbIcd10Service")
public class TbIcd10ServiceImpl implements TbIcd10Service {

	private final static Logger LOG = LoggerFactory.getLogger(TbIcd10ServiceImpl.class);

	@Resource
	private TbIcd10Mapper tbIcd10Mapper;

	@Override
	public Boolean addTbIcd10(TbIcd10 tbIcd10) throws Exception {
		return tbIcd10Mapper.insert(tbIcd10)>0;
	}

	@Override
	public Boolean updateTbIcd10(TbIcd10 tbIcd10) throws Exception {
		return tbIcd10Mapper.updateByPrimaryKey(tbIcd10)>0;
	}

	@Override
	public TbIcd10 findDetailTbIcd10(String icd) throws Exception {
		return tbIcd10Mapper.selectByPrimaryKey(icd);
	}

	@Override
	public Boolean deleteTbIcd10(String icd) throws Exception {
		return tbIcd10Mapper.deleteByPrimaryKey(icd)>0;
	}

//	@Override
//	public Result addTbIcd10(TbIcd10Model tbIcd10Model) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbIcd10(TbIcd10Model tbIcd10Model) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbIcd10(TbIcd10Model tbIcd10Model) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbIcd10(TbIcd10Model tbIcd10Model) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbIcd10Page(TbIcd10Model tbIcd10Model) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbIcd10(TbIcd10Model tbIcd10Model) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbIcd10(TbIcd10Model tbIcd10Model) throws Exception{
//		return null;
//	}

}