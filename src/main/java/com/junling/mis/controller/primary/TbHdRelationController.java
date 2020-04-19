package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.TbHdRelation;
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
    public MakeResult addTbHdRelation(@RequestBody TbHdRelation tbHdRelation) throws Exception {
        if(service.addTbHdRelation(tbHdRelation)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbHdRelation(@RequestBody TbHdRelation tbHdRelation) throws Exception {
        if(service.updateTbHdRelation(tbHdRelation)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{hospitalDepartmentId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<TbHdRelation> searchTbHdRelation(@PathVariable("hospitalDepartmentId") String hospitalDepartmentId) throws Exception {
        TbHdRelation tbHdRelation = service.findDetailTbHdRelation(hospitalDepartmentId);
        MakeResult<TbHdRelation> result = MakeResult.createResult(ResultStatus.OK_CODE);
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
