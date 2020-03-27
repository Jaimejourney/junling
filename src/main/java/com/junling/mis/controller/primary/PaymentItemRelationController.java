package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.paymentItemRelationEntity;
import com.junling.mis.service.primary.PaymentItemRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/paymentItemRelation")
public class PaymentItemRelationController {

    @Autowired
    private PaymentItemRelationService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addPaymentItemRelation(@RequestBody paymentItemRelationEntity paymentItemRelationEntity) throws Exception {
        if(service.addPaymentItemRelation(paymentItemRelationEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }
}
