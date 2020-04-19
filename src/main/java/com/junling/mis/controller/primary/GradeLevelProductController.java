package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.GradeLevelProduct;
import com.junling.mis.service.primary.GradeLevelProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/gradeLevelProduct")
public class GradeLevelProductController {

    @Autowired
    private GradeLevelProductService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addGradeLevelProduct(@RequestBody GradeLevelProduct gradeLevelProduct) throws Exception {
        if(service.addGradeLevelProduct(gradeLevelProduct)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateGradeLevelProduct(@RequestBody GradeLevelProduct gradeLevelProduct) throws Exception {
        if(service.updateGradeLevelProduct(gradeLevelProduct)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{gradeLevelProductId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<GradeLevelProduct> searchGradeLevelProduct(@PathVariable("gradeLevelProductId") String gradeLevelProductId) throws Exception {
        GradeLevelProduct gradeLevelProduct = service.findDetailGradeLevelProduct(gradeLevelProductId);
        MakeResult<GradeLevelProduct> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(gradeLevelProduct == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(gradeLevelProduct);
    }

    @RequestMapping(value = "/delete/{gradeLevelProductId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delGradeLevelProduct(@PathVariable("gradeLevelProductId") String gradeLevelProductId) throws Exception {
        if(service.deleteGradeLevelProduct(gradeLevelProductId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
