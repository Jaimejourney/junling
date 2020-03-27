package com.junling.mis.controller.primary;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.customerActionEntity;
import com.junling.mis.service.primary.CustomerActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/customerAction")
public class CustomerActionController {

    @Autowired
    private CustomerActionService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addCustomerAction(@RequestBody customerActionEntity customerActionEntity) throws Exception {
        if(service.addCustomerAction(customerActionEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateCustomerAction(@RequestBody customerActionEntity customerActionEntity) throws Exception {
        if(service.updateCustomerAction(customerActionEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{customerActionId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<customerActionEntity> searchCustomerAction(@PathVariable("customerActionId") String customerActionId) throws Exception {
        customerActionEntity customerActionEntity = service.findDetailCustomerAction(customerActionId);
        MakeResult<customerActionEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(customerActionEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(customerActionEntity);
    }

    @RequestMapping(value = "/delete/{customerActionId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delCustomerAction(@PathVariable("customerActionId") String customerActionId) throws Exception {
        if(service.deleteCustomerAction(customerActionId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
