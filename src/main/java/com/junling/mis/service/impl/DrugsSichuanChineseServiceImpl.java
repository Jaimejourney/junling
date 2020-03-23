package com.junling.mis.service.impl;

import com.junling.mis.mapper.drugsSichuanChineseEntityMapper;
import com.junling.mis.model.drugsSichuanChineseEntity;
import com.junling.mis.service.DrugsSichuanChineseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("drugsSichuanChineseService")
public class DrugsSichuanChineseServiceImpl implements DrugsSichuanChineseService {

	private final static Logger LOG = LoggerFactory.getLogger(DrugsSichuanChineseServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.drugsSichuanChineseEntityMapper drugsSichuanChineseEntityMapper;

	@Override
	public Boolean addDrugsSichuanChinese(drugsSichuanChineseEntity drugsSichuanChineseEntity) throws Exception {
		return drugsSichuanChineseEntityMapper.insert(drugsSichuanChineseEntity)>0;
	}

//	@Override
//	public Result addDrugsSichuanChinese(DrugsSichuanChineseModel drugsSichuanChineseModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateDrugsSichuanChinese(DrugsSichuanChineseModel drugsSichuanChineseModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailDrugsSichuanChinese(DrugsSichuanChineseModel drugsSichuanChineseModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listDrugsSichuanChinese(DrugsSichuanChineseModel drugsSichuanChineseModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listDrugsSichuanChinesePage(DrugsSichuanChineseModel drugsSichuanChineseModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countDrugsSichuanChinese(DrugsSichuanChineseModel drugsSichuanChineseModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteDrugsSichuanChinese(DrugsSichuanChineseModel drugsSichuanChineseModel) throws Exception{
//		return null;
//	}

}