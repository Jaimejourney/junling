package com.junling.mis.service.impl;

import com.junling.mis.mapper.tbIcd10EntityMapper;
import com.junling.mis.model.tbIcd10Entity;
import com.junling.mis.service.TbIcd10Service;
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
	private com.junling.mis.mapper.tbIcd10EntityMapper tbIcd10EntityMapper;

	@Override
	public Boolean addTbIcd10(tbIcd10Entity tbIcd10Entity) throws Exception {
		return tbIcd10EntityMapper.insert(tbIcd10Entity)>0;
	}

	@Override
	public Boolean updateTbIcd10(tbIcd10Entity tbIcd10Entity) throws Exception {
		return tbIcd10EntityMapper.updateByPrimaryKey(tbIcd10Entity)>0;
	}

	@Override
	public tbIcd10Entity findDetailTbIcd10(String icd) throws Exception {
		return tbIcd10EntityMapper.selectByPrimaryKey(icd);
	}

	@Override
	public Boolean deleteTbIcd10(String icd) throws Exception {
		return tbIcd10EntityMapper.deleteByPrimaryKey(icd)>0;
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