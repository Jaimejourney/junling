package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbHdRelation;
import com.junling.mis.service.primary.TbHdRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbHdRelation")
public class TbHdRelationController {

    @Autowired
    private TbHdRelationService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbHdRelation(@RequestBody tbHdRelation tbHdRelation) throws Exception {
        if(service.addTbHdRelation(tbHdRelation)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbHdRelation(@RequestBody tbHdRelation tbHdRelation) throws Exception {
        if(service.updateTbHdRelation(tbHdRelation)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{hospitalDepartmentId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbHdRelation> searchTbHdRelation(@PathVariable("hospitalDepartmentId") String hospitalDepartmentId) throws Exception {
        tbHdRelation tbHdRelation = service.findDetailTbHdRelation(hospitalDepartmentId);
        MakeResult<tbHdRelation> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbHdRelation == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbHdRelation);
    }

    @RequestMapping(value = "/delete/{hospitalDepartmentId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbHdRelation(@PathVariable("hospitalDepartmentId") String hospitalDepartmentId) throws Exception {
        if(service.deleteTbHdRelation(hospitalDepartmentId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
