package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.TbRelation;
import com.junling.mis.service.primary.TbRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbRelation")
public class TbRelationController {

    @Autowired
    private TbRelationService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbRelation(@RequestBody TbRelation tbRelation) throws Exception {
        if(service.addTbRelation(tbRelation)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbRelation(@RequestBody TbRelation tbRelation) throws Exception {
        if(service.updateTbRelation(tbRelation)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{relationCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<TbRelation> searchTbRelation(@PathVariable("relationCode") String relationCode) throws Exception {
        TbRelation tbRelation = service.findDetailTbRelation(relationCode);
        MakeResult<TbRelation> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbRelation == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbRelation);
    }

    @RequestMapping(value = "/delete/{relationCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbRelation(@PathVariable("relationCode") String relationCode) throws Exception {
        if(service.deleteTbRelation(relationCode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
