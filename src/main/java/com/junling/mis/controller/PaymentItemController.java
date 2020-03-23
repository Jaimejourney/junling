package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.paymentItemEntity;
import com.junling.mis.model.paymentItemRelationEntity;
import com.junling.mis.service.PaymentItemRelationService;
import com.junling.mis.service.PaymentItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/paymentItem")
public class PaymentItemController {

    @Autowired
    private PaymentItemService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addPaymentItem(@RequestBody paymentItemEntity paymentItemEntity) throws Exception {
        if(service.addPaymentItem(paymentItemEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }
}
