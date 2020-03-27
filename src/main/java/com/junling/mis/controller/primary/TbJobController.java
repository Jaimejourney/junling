package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbJobEntity;
import com.junling.mis.service.primary.TbJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbJobType")
public class TbJobController {

    @Autowired
    private TbJobService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbJob(@RequestBody tbJobEntity tbJobEntity) throws Exception {
        if(service.addTbJob(tbJobEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbJob(@RequestBody tbJobEntity tbJobEntity) throws Exception {
        if(service.updateTbJob(tbJobEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{jobCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbJobEntity> searchTbJob(@PathVariable("jobCode") String jobCode) throws Exception {
        tbJobEntity tbJobEntity = service.findDetailTbJob(jobCode);
        MakeResult<tbJobEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbJobEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbJobEntity);
    }

    @RequestMapping(value = "/delete/{jobCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbJob(@PathVariable("jobCode") String jobCode) throws Exception {
        if(service.deleteTbJob(jobCode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
