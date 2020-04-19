package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.TbImageType;
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
    public MakeResult addTbImageType(@RequestBody TbImageType tbImageType) throws Exception {
        if(service.addTbImageType(tbImageType)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbImageType(@RequestBody TbImageType tbImageType) throws Exception {
        if(service.updateTbImageType(tbImageType)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{docTypeCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<TbImageType> searchTbImageType(@PathVariable("docTypeCode") String docTypeCode) throws Exception {
        TbImageType tbImageType = service.findDetailTbImageType(docTypeCode);
        MakeResult<TbImageType> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbImageType == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbImageType);
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
