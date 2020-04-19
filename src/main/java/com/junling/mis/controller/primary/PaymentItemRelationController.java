package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.PaymentItemRelation;
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
    public MakeResult addPaymentItemRelation(@RequestBody PaymentItemRelation paymentItemRelation) throws Exception {
        if(service.addPaymentItemRelation(paymentItemRelation)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }
}
