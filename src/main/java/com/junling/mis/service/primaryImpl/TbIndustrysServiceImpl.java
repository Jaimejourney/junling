package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.TbIndustrysMapper;
import com.junling.mis.model.primary.TbIndustrys;
import com.junling.mis.service.primary.TbIndustrysService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbIndustrysService")
public class TbIndustrysServiceImpl implements TbIndustrysService {

	private final static Logger LOG = LoggerFactory.getLogger(TbIndustrysServiceImpl.class);

	@Resource
	private TbIndustrysMapper tbIndustrysMapper;

	@Override
	public Boolean addTbIndustrys(TbIndustrys tbIndustrys) throws Exception {
		return tbIndustrysMapper.insert(tbIndustrys)>0;
	}

	@Override
	public Boolean updateTbIndustrys(TbIndustrys tbIndustrys) throws Exception {
		return tbIndustrysMapper.updateByPrimaryKey(tbIndustrys)>0;
	}

	@Override
	public TbIndustrys findDetailTbIndustrys(String industryTypeCode) throws Exception {
		return tbIndustrysMapper.selectByPrimaryKey(industryTypeCode);
	}

	@Override
	public Boolean deleteTbIndustrys(String industryTypeCode) throws Exception {
		return tbIndustrysMapper.deleteByPrimaryKey(industryTypeCode)>0;
	}

//	@Override
//	public Result addTbIndustrys(TbIndustrysModel tbIndustrysModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbIndustrys(TbIndustrysModel tbIndustrysModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbIndustrys(TbIndustrysModel tbIndustrysModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbIndustrys(TbIndustrysModel tbIndustrysModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbIndustrysPage(TbIndustrysModel tbIndustrysModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbIndustrys(TbIndustrysModel tbIndustrysModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbIndustrys(TbIndustrysModel tbIndustrysModel) throws Exception{
//		return null;
//	}

}