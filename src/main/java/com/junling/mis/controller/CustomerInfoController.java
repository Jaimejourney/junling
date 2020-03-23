package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.customerInfoEntity;
import com.junling.mis.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/customerInfo")
public class CustomerInfoController {
    @Autowired
    private CustomerInfoService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addCustomerInfo(@RequestBody customerInfoEntity customerInfoEntity) throws Exception {
        if(service.addCustomerInfo(customerInfoEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateCustomerInfo(@RequestBody customerInfoEntity customerInfoEntity) throws Exception {
        if(service.updateCustomerInfo(customerInfoEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{customerNo}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<customerInfoEntity> searchCustomerInfo(@PathVariable("customerNo") String customerNo) throws Exception {
        customerInfoEntity customerInfoEntity = service.findDetailCustomerInfo(customerNo);
        MakeResult<customerInfoEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(customerInfoEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(customerInfoEntity);
    }

    @RequestMapping(value = "/delete/{customerNo}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delCustomerInfo(@PathVariable("customerNo") String customerNo) throws Exception {
        if(service.deleteCustomerInfo(customerNo)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
