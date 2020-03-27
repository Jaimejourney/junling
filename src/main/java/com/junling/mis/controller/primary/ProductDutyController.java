package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.productDutyEntity;
import com.junling.mis.model.primary.productDutyEntityKey;
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
    public MakeResult addProductDuty(@RequestBody productDutyEntity productDutyEntity) throws Exception {
        if(service.addProductDuty(productDutyEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateProductDuty(@RequestBody productDutyEntity productDutyEntity) throws Exception {
        if(service.updateProductDuty(productDutyEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult<productDutyEntity> searchProductDuty(@RequestBody productDutyEntityKey key) throws Exception {
        productDutyEntity productDutyEntity = service.findDetailProductDuty(key);
        MakeResult<productDutyEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(productDutyEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(productDutyEntity);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult delProductDuty(@RequestBody productDutyEntityKey key) throws Exception {
        if(service.deleteProductDuty(key)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
