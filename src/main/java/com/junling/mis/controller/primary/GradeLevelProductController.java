package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.gradeLevelProductEntity;
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
    public MakeResult addGradeLevelProduct(@RequestBody gradeLevelProductEntity gradeLevelProductEntity) throws Exception {
        if(service.addGradeLevelProduct(gradeLevelProductEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateGradeLevelProduct(@RequestBody gradeLevelProductEntity gradeLevelProductEntity) throws Exception {
        if(service.updateGradeLevelProduct(gradeLevelProductEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{gradeLevelProductId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<gradeLevelProductEntity> searchGradeLevelProduct(@PathVariable("gradeLevelProductId") String gradeLevelProductId) throws Exception {
        gradeLevelProductEntity gradeLevelProductEntity = service.findDetailGradeLevelProduct(gradeLevelProductId);
        MakeResult<gradeLevelProductEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(gradeLevelProductEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(gradeLevelProductEntity);
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
