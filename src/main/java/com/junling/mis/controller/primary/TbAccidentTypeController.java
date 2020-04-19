package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.TbAccidentType;
import com.junling.mis.service.primary.TbAccidentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbAccidentTypeLog")
public class TbAccidentTypeController {

    @Autowired
    private TbAccidentTypeService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbAccidentType(@RequestBody TbAccidentType tbAccidentType) throws Exception {
        if(service.addTbAccidentType(tbAccidentType)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbAccidentType(@RequestBody TbAccidentType tbAccidentType) throws Exception {
        if(service.updateTbAccidentType(tbAccidentType)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{accidentTypeCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<TbAccidentType> searchTbAccidentType(@PathVariable("accidentTypeCode") String accidentTypeCode) throws Exception {
        TbAccidentType tbAccidentType = service.findDetailTbAccidentType(accidentTypeCode);
        MakeResult<TbAccidentType> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbAccidentType == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbAccidentType);
    }

    @RequestMapping(value = "/delete/{accidentTypeCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbAccidentType(@PathVariable("accidentTypeCode") String accidentTypeCode) throws Exception {
        if(service.deleteTbAccidentType(accidentTypeCode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
