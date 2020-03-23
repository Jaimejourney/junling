package com.junling.mis.service.impl;

import com.junling.mis.mapper.tbBankEntityMapper;
import com.junling.mis.model.tbBankEntity;
import com.junling.mis.service.TbBankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbBankService")
public class TbBankServiceImpl implements TbBankService {

	private final static Logger LOG = LoggerFactory.getLogger(TbBankServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.tbBankEntityMapper tbBankEntityMapper;

	@Override
	public Boolean addTbBank(tbBankEntity tbBankEntity) throws Exception {
		return tbBankEntityMapper.insert(tbBankEntity)>0;
	}

	@Override
	public Boolean updateTbBank(tbBankEntity tbBankEntity) throws Exception {
		return tbBankEntityMapper.updateByPrimaryKey(tbBankEntity)>0;
	}

	@Override
	public tbBankEntity findDetailTbBank(String bankCode) throws Exception {
		return tbBankEntityMapper.selectByPrimaryKey(bankCode);
	}

	@Override
	public Boolean deleteTbBank(String bankCode) throws Exception {
		return tbBankEntityMapper.deleteByPrimaryKey(bankCode)>0;
	}

//	@Override
//	public Result addTbBank(TbBankModel tbBankModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbBank(TbBankModel tbBankModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbBank(TbBankModel tbBankModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbBank(TbBankModel tbBankModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbBankPage(TbBankModel tbBankModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbBank(TbBankModel tbBankModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbBank(TbBankModel tbBankModel) throws Exception{
//		return null;
//	}

}