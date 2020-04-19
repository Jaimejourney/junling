package com.junling.mis.controller.primary;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.CustomerInfo;
import com.junling.mis.service.primary.CustomerInfoService;
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
    public MakeResult addCustomerInfo(@RequestBody CustomerInfo customerInfo) throws Exception {
        if(service.addCustomerInfo(customerInfo)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateCustomerInfo(@RequestBody CustomerInfo customerInfo) throws Exception {
        if(service.updateCustomerInfo(customerInfo)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{customerNo}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<CustomerInfo> searchCustomerInfo(@PathVariable("customerNo") String customerNo) throws Exception {
        CustomerInfo customerInfo = service.findDetailCustomerInfo(customerNo);
        MakeResult<CustomerInfo> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(customerInfo == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(customerInfo);
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
