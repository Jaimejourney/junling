package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.tbBank;
import com.junling.mis.service.primary.TbBankService;
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
	private com.junling.mis.mapper.primary.tbBankMapper tbBankMapper;

	@Override
	public Boolean addTbBank(tbBank tbBank) throws Exception {
		return tbBankMapper.insert(tbBank)>0;
	}

	@Override
	public Boolean updateTbBank(tbBank tbBank) throws Exception {
		return tbBankMapper.updateByPrimaryKey(tbBank)>0;
	}

	@Override
	public tbBank findDetailTbBank(String bankCode) throws Exception {
		return tbBankMapper.selectByPrimaryKey(bankCode);
	}

	@Override
	public Boolean deleteTbBank(String bankCode) throws Exception {
		return tbBankMapper.deleteByPrimaryKey(bankCode)>0;
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