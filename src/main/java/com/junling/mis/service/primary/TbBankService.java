package com.junling.mis.service.primary;

import com.junling.mis.model.primary.TbBank;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbBankService {

	Boolean addTbBank(TbBank tbBank) throws Exception;

	Boolean updateTbBank(TbBank tbBank) throws Exception;

	TbBank findDetailTbBank(String bankCode) throws Exception;
	
//	Result listTbBank(TbBankModel tbBankModel) throws Exception;
//
//    Result listTbBankPage(TbBankModel tbBankModel) throws Exception;
//
//	Result countTbBank(TbBankModel tbBankModel) throws Exception;
	
	Boolean deleteTbBank(String bankCode) throws Exception;
}