package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.rejectCause;
import com.junling.mis.service.primary.RejectCauseService;
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
    public MakeResult addRejectCause(@RequestBody rejectCause rejectCause) throws Exception {
        if(service.addRejectCause(rejectCause)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateRejectCause(@RequestBody rejectCause rejectCause) throws Exception {
        if(service.updateRejectCause(rejectCause)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{rejectCauseCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<rejectCause> searchRejectCause(@PathVariable("rejectCauseCode") String rejectCauseCode) throws Exception {
        rejectCause rejectCause = service.findDetailRejectCause(rejectCauseCode);
        MakeResult<rejectCause> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(rejectCause == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(rejectCause);
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
