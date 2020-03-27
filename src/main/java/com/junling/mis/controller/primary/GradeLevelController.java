package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.gradeLevelEntity;
import com.junling.mis.service.primary.GradeLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/gradeLevel")
public class GradeLevelController {

    @Autowired
    private GradeLevelService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addGradeLevel(@RequestBody gradeLevelEntity gradeLevelEntity) throws Exception {
        if(service.addGradeLevel(gradeLevelEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateGradeLevel(@RequestBody gradeLevelEntity gradeLevelEntity) throws Exception {
        if(service.updateGradeLevel(gradeLevelEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{gradeLevelId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<gradeLevelEntity> searchGradeLevel(@PathVariable("gradeLevelId") String gradeLevelId) throws Exception {
        gradeLevelEntity gradeLevelEntity = service.findDetailGradeLevel(gradeLevelId);
        MakeResult<gradeLevelEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(gradeLevelEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(gradeLevelEntity);
    }

    @RequestMapping(value = "/delete/{gradeLevelId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delGradeLevel(@PathVariable("gradeLevelId") String gradeLevelId) throws Exception {
        if(service.deleteGradeLevel(gradeLevelId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
