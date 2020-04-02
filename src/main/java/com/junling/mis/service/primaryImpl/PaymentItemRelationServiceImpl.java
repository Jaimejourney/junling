package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.paymentItemRelation;
import com.junling.mis.service.primary.PaymentItemRelationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("paymentItemRelationService")
public class PaymentItemRelationServiceImpl implements PaymentItemRelationService {

	private final static Logger LOG = LoggerFactory.getLogger(PaymentItemRelationServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.paymentItemRelationMapper paymentItemRelationMapper;

	@Override
	public Boolean addPaymentItemRelation(paymentItemRelation paymentItemRelation) throws Exception {
		return paymentItemRelationMapper.insert(paymentItemRelation) > 0;
	}
//
//	@Override
//	public Result addPaymentItemRelation(PaymentItemRelationModel paymentItemRelationModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updatePaymentItemRelation(PaymentItemRelationModel paymentItemRelationModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailPaymentItemRelation(PaymentItemRelationModel paymentItemRelationModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPaymentItemRelation(PaymentItemRelationModel paymentItemRelationModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPaymentItemRelationPage(PaymentItemRelationModel paymentItemRelationModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countPaymentItemRelation(PaymentItemRelationModel paymentItemRelationModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deletePaymentItemRelation(PaymentItemRelationModel paymentItemRelationModel) throws Exception{
//		return null;
//	}

}