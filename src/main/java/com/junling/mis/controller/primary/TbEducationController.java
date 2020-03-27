package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbEducationEntity;
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
    public MakeResult addTbEducation(@RequestBody tbEducationEntity tbEducationEntity) throws Exception {
        if(service.addTbEducation(tbEducationEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbEducation(@RequestBody tbEducationEntity tbEducationEntity) throws Exception {
        if(service.updateTbEducation(tbEducationEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{educationCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbEducationEntity> searchTbEducation(@PathVariable("educationCode") String educationCode) throws Exception {
        tbEducationEntity tbEducationEntity = service.findDetailTbEducation(educationCode);
        MakeResult<tbEducationEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbEducationEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbEducationEntity);
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
