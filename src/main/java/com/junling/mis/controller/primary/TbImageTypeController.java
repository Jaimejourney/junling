package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbImageTypeEntity;
import com.junling.mis.service.primary.TbImageTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbImageType")
public class TbImageTypeController {

    @Autowired
    private TbImageTypeService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbImageType(@RequestBody tbImageTypeEntity tbImageTypeEntity) throws Exception {
        if(service.addTbImageType(tbImageTypeEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbImageType(@RequestBody tbImageTypeEntity tbImageTypeEntity) throws Exception {
        if(service.updateTbImageType(tbImageTypeEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{docTypeCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbImageTypeEntity> searchTbImageType(@PathVariable("docTypeCode") String docTypeCode) throws Exception {
        tbImageTypeEntity tbImageTypeEntity = service.findDetailTbImageType(docTypeCode);
        MakeResult<tbImageTypeEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbImageTypeEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbImageTypeEntity);
    }

    @RequestMapping(value = "/delete/{docTypeCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbImageType(@PathVariable("docTypeCode") String docTypeCode) throws Exception {
        if(service.deleteTbImageType(docTypeCode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
