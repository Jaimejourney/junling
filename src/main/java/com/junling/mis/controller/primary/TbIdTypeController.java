package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbIdType;
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
    public MakeResult addTbIdType(@RequestBody tbIdType tbIdType) throws Exception {
        if(service.addTbIdType(tbIdType)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbIdType(@RequestBody tbIdType tbIdType) throws Exception {
        if(service.updateTbIdType(tbIdType)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{idTypeCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbIdType> searchTbIdType(@PathVariable("idTypeCode") String idTypeCode) throws Exception {
        tbIdType tbIdType = service.findDetailTbIdType(idTypeCode);
        MakeResult<tbIdType> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbIdType == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbIdType);
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
