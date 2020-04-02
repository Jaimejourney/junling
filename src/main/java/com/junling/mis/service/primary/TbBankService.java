package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbBank;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbBankService {

	Boolean addTbBank(tbBank tbBank) throws Exception;

	Boolean updateTbBank(tbBank tbBank) throws Exception;

	tbBank findDetailTbBank(String bankCode) throws Exception;
	
//	Result listTbBank(TbBankModel tbBankModel) throws Exception;
//
//    Result listTbBankPage(TbBankModel tbBankModel) throws Exception;
//
//	Result countTbBank(TbBankModel tbBankModel) throws Exception;
	
	Boolean deleteTbBank(String bankCode) throws Exception;
}