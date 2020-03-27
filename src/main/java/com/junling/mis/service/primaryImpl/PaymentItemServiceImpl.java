package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.paymentItemEntity;
import com.junling.mis.service.primary.PaymentItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("paymentItemService")
public class PaymentItemServiceImpl implements PaymentItemService {

	private final static Logger LOG = LoggerFactory.getLogger(PaymentItemServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.paymentItemEntityMapper paymentItemEntityMapper;

	@Override
	public Boolean addPaymentItem(paymentItemEntity paymentItemEntity) throws Exception {
		return paymentItemEntityMapper.insert(paymentItemEntity) > 0;
	}
//
//	@Override
//	public Result addPaymentItem(PaymentItemModel paymentItemModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updatePaymentItem(PaymentItemModel paymentItemModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailPaymentItem(PaymentItemModel paymentItemModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPaymentItem(PaymentItemModel paymentItemModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPaymentItemPage(PaymentItemModel paymentItemModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countPaymentItem(PaymentItemModel paymentItemModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deletePaymentItem(PaymentItemModel paymentItemModel) throws Exception{
//		return null;
//	}

}