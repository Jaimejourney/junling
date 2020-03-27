package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbBankEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbBankService {

	Boolean addTbBank(tbBankEntity tbBankEntity) throws Exception;

	Boolean updateTbBank(tbBankEntity tbBankEntity) throws Exception;

	tbBankEntity findDetailTbBank(String bankCode) throws Exception;
	
//	Result listTbBank(TbBankModel tbBankModel) throws Exception;
//
//    Result listTbBankPage(TbBankModel tbBankModel) throws Exception;
//
//	Result countTbBank(TbBankModel tbBankModel) throws Exception;
	
	Boolean deleteTbBank(String bankCode) throws Exception;
}