package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.tbRelationHospitalEntity;
import com.junling.mis.model.thirdPartyPaymentEntity;
import com.junling.mis.service.TbRelationHospitalService;
import com.junling.mis.service.ThirdPartyPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/thirdPartyPayment")
public class ThirdPartyPaymentController {

    @Autowired
    private ThirdPartyPaymentService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addThirdPartyPayment(@RequestBody thirdPartyPaymentEntity thirdPartyPaymentEntity) throws Exception {
        if(service.addThirdPartyPayment(thirdPartyPaymentEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }
}
