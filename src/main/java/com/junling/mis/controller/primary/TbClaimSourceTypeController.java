package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbClaimSourceTypeEntity;
import com.junling.mis.service.primary.TbClaimSourceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbClaimSourceType")
public class TbClaimSourceTypeController {

    @Autowired
    private TbClaimSourceTypeService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbClaimSourceType(@RequestBody tbClaimSourceTypeEntity tbClaimSourceTypeEntity) throws Exception {
        if(service.addTbClaimSourceType(tbClaimSourceTypeEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbClaimSourceType(@RequestBody tbClaimSourceTypeEntity tbClaimSourceTypeEntity) throws Exception {
        if(service.updateTbClaimSourceType(tbClaimSourceTypeEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{statusCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbClaimSourceTypeEntity> searchTbClaimSourceType(@PathVariable("statusCode") String statusCode) throws Exception {
        tbClaimSourceTypeEntity tbClaimSourceTypeEntity = service.findDetailTbClaimSourceType(statusCode);
        MakeResult<tbClaimSourceTypeEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbClaimSourceTypeEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbClaimSourceTypeEntity);
    }

    @RequestMapping(value = "/delete/{statusCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbClaimSourceType(@PathVariable("statusCode") String statusCode) throws Exception {
        if(service.deleteTbClaimSourceType(statusCode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
