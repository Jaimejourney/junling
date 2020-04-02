package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.productDuty;
import com.junling.mis.service.primary.ProductDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/productDuty")
public class ProductDutyController {

    @Autowired
    private ProductDutyService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addProductDuty(@RequestBody productDuty productDuty) throws Exception {
        if(service.addProductDuty(productDuty)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateProductDuty(@RequestBody productDuty productDuty) throws Exception {
        if(service.updateProductDuty(productDuty)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult<productDuty> searchProductDuty(@RequestBody String productDutyId) throws Exception {
        productDuty productDuty = service.findDetailProductDuty(productDutyId);
        MakeResult<productDuty> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(productDuty == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(productDuty);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult delProductDuty(@RequestBody String productDutyId) throws Exception {
        if(service.deleteProductDuty(productDutyId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
