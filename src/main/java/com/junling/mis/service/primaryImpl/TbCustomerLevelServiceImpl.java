package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.tbCustomerLevel;
import com.junling.mis.service.primary.TbCustomerLevelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbCustomerLevelService")
public class TbCustomerLevelServiceImpl implements TbCustomerLevelService {

	private final static Logger LOG = LoggerFactory.getLogger(TbCustomerLevelServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.tbCustomerLevelMapper tbCustomerLevelMapper;

	@Override
	public Boolean addTbCustomerLevel(tbCustomerLevel tbCustomerLevel) throws Exception {
		return tbCustomerLevelMapper.insert(tbCustomerLevel)>0;
	}

	@Override
	public Boolean updateTbCustomerLevel(tbCustomerLevel tbCustomerLevel) throws Exception {
		return tbCustomerLevelMapper.updateByPrimaryKey(tbCustomerLevel)>0;
	}

	@Override
	public tbCustomerLevel findDetailTbCustomerLevel(String customerLevelCode) throws Exception {
		return tbCustomerLevelMapper.selectByPrimaryKey(customerLevelCode);
	}

	@Override
	public Boolean deleteTbCustomerLevel(String customerLevelCode) throws Exception {
		return tbCustomerLevelMapper.deleteByPrimaryKey(customerLevelCode)>0;
	}

//	@Override
//	public Result addTbCustomerLevel(TbCustomerLevelModel tbCustomerLevelModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbCustomerLevel(TbCustomerLevelModel tbCustomerLevelModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbCustomerLevel(TbCustomerLevelModel tbCustomerLevelModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbCustomerLevel(TbCustomerLevelModel tbCustomerLevelModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbCustomerLevelPage(TbCustomerLevelModel tbCustomerLevelModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbCustomerLevel(TbCustomerLevelModel tbCustomerLevelModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbCustomerLevel(TbCustomerLevelModel tbCustomerLevelModel) throws Exception{
//		return null;
//	}

}