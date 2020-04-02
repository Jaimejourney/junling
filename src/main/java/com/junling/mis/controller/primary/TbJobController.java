package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbJob;
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
    public MakeResult addTbJob(@RequestBody tbJob tbJob) throws Exception {
        if(service.addTbJob(tbJob)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbJob(@RequestBody tbJob tbJob) throws Exception {
        if(service.updateTbJob(tbJob)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{jobCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbJob> searchTbJob(@PathVariable("jobCode") String jobCode) throws Exception {
        tbJob tbJob = service.findDetailTbJob(jobCode);
        MakeResult<tbJob> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbJob == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbJob);
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
