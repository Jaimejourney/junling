package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.productInfoEntity;
import com.junling.mis.model.rejectCauseEntity;
import com.junling.mis.service.ProductInfoService;
import com.junling.mis.service.RejectCauseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/rejectCause")
public class RejectCauseController {

    @Autowired
    private RejectCauseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addRejectCause(@RequestBody rejectCauseEntity rejectCauseEntity) throws Exception {
        if(service.addRejectCause(rejectCauseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateRejectCause(@RequestBody rejectCauseEntity rejectCauseEntity) throws Exception {
        if(service.updateRejectCause(rejectCauseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{rejectCauseCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<rejectCauseEntity> searchRejectCause(@PathVariable("rejectCauseCode") String rejectCauseCode) throws Exception {
        rejectCauseEntity rejectCauseEntity = service.findDetailRejectCause(rejectCauseCode);
        MakeResult<rejectCauseEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(rejectCauseEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(rejectCauseEntity);
    }

    @RequestMapping(value = "/delete/{rejectCauseCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delRejectCause(@PathVariable("rejectCauseCode") String rejectCauseCode) throws Exception {
        if(service.deleteRejectCause(rejectCauseCode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
