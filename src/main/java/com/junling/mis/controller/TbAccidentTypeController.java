package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.syncLogEntity;
import com.junling.mis.model.tbAccidentTypeEntity;
import com.junling.mis.service.SyncLogService;
import com.junling.mis.service.TbAccidentTypeService;
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
    public MakeResult addTbAccidentType(@RequestBody tbAccidentTypeEntity tbAccidentTypeEntity) throws Exception {
        if(service.addTbAccidentType(tbAccidentTypeEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbAccidentType(@RequestBody tbAccidentTypeEntity tbAccidentTypeEntity) throws Exception {
        if(service.updateTbAccidentType(tbAccidentTypeEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{accidentTypeCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbAccidentTypeEntity> searchTbAccidentType(@PathVariable("accidentTypeCode") String accidentTypeCode) throws Exception {
        tbAccidentTypeEntity tbAccidentTypeEntity = service.findDetailTbAccidentType(accidentTypeCode);
        MakeResult<tbAccidentTypeEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbAccidentTypeEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbAccidentTypeEntity);
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
