package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.ProductInfo;
import com.junling.mis.service.primary.ProductInfoService;
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
    public MakeResult addProductInfo(@RequestBody ProductInfo productInfo) throws Exception {
        if(service.addProductInfo(productInfo)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateProductInfo(@RequestBody ProductInfo productInfo) throws Exception {
        if(service.updateProductInfo(productInfo)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{productId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<ProductInfo> searchProductInfo(@PathVariable("productId") String productId) throws Exception {
        ProductInfo productInfo = service.findDetailProductInfo(productId);
        MakeResult<ProductInfo> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(productInfo == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(productInfo);
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
