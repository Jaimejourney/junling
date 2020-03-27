package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbClaimStatusEntity;
import com.junling.mis.service.primary.TbClaimStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbClaimStatus")
public class TbClaimStatusController {

    @Autowired
    private TbClaimStatusService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbClaimStatus(@RequestBody tbClaimStatusEntity tbClaimStatusEntity) throws Exception {
        if(service.addTbClaimStatus(tbClaimStatusEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbClaimStatus(@RequestBody tbClaimStatusEntity tbClaimStatusEntity) throws Exception {
        if(service.updateTbClaimStatus(tbClaimStatusEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{statusCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbClaimStatusEntity> searchTbClaimStatus(@PathVariable("statusCode") String statusCode) throws Exception {
        tbClaimStatusEntity tbClaimStatusEntity = service.findDetailTbClaimStatus(statusCode);
        MakeResult<tbClaimStatusEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbClaimStatusEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbClaimStatusEntity);
    }

    @RequestMapping(value = "/delete/{statusCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbClaimStatus(@PathVariable("statusCode") String statusCode) throws Exception {
        if(service.deleteTbClaimStatus(statusCode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
