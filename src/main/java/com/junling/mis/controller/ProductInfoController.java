package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.policyReinsuranceEntity;
import com.junling.mis.model.productDutyEntity;
import com.junling.mis.model.productDutyEntityKey;
import com.junling.mis.model.productInfoEntity;
import com.junling.mis.service.ProductDutyService;
import com.junling.mis.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/productInfo")
public class ProductInfoController {

    @Autowired
    private ProductInfoService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addProductInfo(@RequestBody productInfoEntity productInfoEntity) throws Exception {
        if(service.addProductInfo(productInfoEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateProductInfo(@RequestBody productInfoEntity productInfoEntity) throws Exception {
        if(service.updateProductInfo(productInfoEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{productId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<productInfoEntity> searchProductInfo(@PathVariable("productId") String productId) throws Exception {
        productInfoEntity productInfoEntity = service.findDetailProductInfo(productId);
        MakeResult<productInfoEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(productInfoEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(productInfoEntity);
    }

    @RequestMapping(value = "/delete/{productId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delProductInfo(@PathVariable("productId") String productId) throws Exception {
        if(service.deleteProductInfo(productId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
