package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.thirdPartyPayment;
import com.junling.mis.service.primary.ThirdPartyPaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("thirdPartyPaymentService")
public class ThirdPartyPaymentServiceImpl implements ThirdPartyPaymentService {

	private final static Logger LOG = LoggerFactory.getLogger(ThirdPartyPaymentServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.thirdPartyPaymentMapper thirdPartyPaymentMapper;

	@Override
	public Boolean addThirdPartyPayment(thirdPartyPayment thirdPartyPayment) throws Exception {
		return thirdPartyPaymentMapper.insert(thirdPartyPayment)>0;
	}

//	@Override
//	public Result addThirdPartyPayment(ThirdPartyPaymentModel thirdPartyPaymentModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateThirdPartyPayment(ThirdPartyPaymentModel thirdPartyPaymentModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailThirdPartyPayment(ThirdPartyPaymentModel thirdPartyPaymentModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listThirdPartyPayment(ThirdPartyPaymentModel thirdPartyPaymentModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listThirdPartyPaymentPage(ThirdPartyPaymentModel thirdPartyPaymentModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countThirdPartyPayment(ThirdPartyPaymentModel thirdPartyPaymentModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteThirdPartyPayment(ThirdPartyPaymentModel thirdPartyPaymentModel) throws Exception{
//		return null;
//	}

}