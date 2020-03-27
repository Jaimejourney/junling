package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbIdTypeEntity;
import com.junling.mis.service.primary.TbIdTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbIdType")
public class TbIdTypeController {

    @Autowired
    private TbIdTypeService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbIdType(@RequestBody tbIdTypeEntity tbIdTypeEntity) throws Exception {
        if(service.addTbIdType(tbIdTypeEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbIdType(@RequestBody tbIdTypeEntity tbIdTypeEntity) throws Exception {
        if(service.updateTbIdType(tbIdTypeEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{idTypeCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbIdTypeEntity> searchTbIdType(@PathVariable("idTypeCode") String idTypeCode) throws Exception {
        tbIdTypeEntity tbIdTypeEntity = service.findDetailTbIdType(idTypeCode);
        MakeResult<tbIdTypeEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbIdTypeEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbIdTypeEntity);
    }

    @RequestMapping(value = "/delete/{idTypeCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbIdType(@PathVariable("idTypeCode") String idTypeCode) throws Exception {
        if(service.deleteTbIdType(idTypeCode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
