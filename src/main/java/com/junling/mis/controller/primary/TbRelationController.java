package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbRelationEntity;
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
    public MakeResult addTbRelation(@RequestBody tbRelationEntity tbRelationEntity) throws Exception {
        if(service.addTbRelation(tbRelationEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbRelation(@RequestBody tbRelationEntity tbRelationEntity) throws Exception {
        if(service.updateTbRelation(tbRelationEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{relationCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbRelationEntity> searchTbRelation(@PathVariable("relationCode") String relationCode) throws Exception {
        tbRelationEntity tbRelationEntity = service.findDetailTbRelation(relationCode);
        MakeResult<tbRelationEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbRelationEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbRelationEntity);
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
