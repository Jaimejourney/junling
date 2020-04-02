package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbEducation;
import com.junling.mis.service.primary.TbEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbEducation")
public class TbEducationController {

    @Autowired
    private TbEducationService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbEducation(@RequestBody tbEducation tbEducation) throws Exception {
        if(service.addTbEducation(tbEducation)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbEducation(@RequestBody tbEducation tbEducation) throws Exception {
        if(service.updateTbEducation(tbEducation)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{educationCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbEducation> searchTbEducation(@PathVariable("educationCode") String educationCode) throws Exception {
        tbEducation tbEducation = service.findDetailTbEducation(educationCode);
        MakeResult<tbEducation> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbEducation == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbEducation);
    }

    @RequestMapping(value = "/delete/{educationCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbEducation(@PathVariable("educationCode") String educationCode) throws Exception {
        if(service.deleteTbEducation(educationCode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
