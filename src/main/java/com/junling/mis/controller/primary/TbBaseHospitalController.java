package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbBaseHospitalEntityWithBLOBs;
import com.junling.mis.service.primary.TbBaseHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbBaseHospital")
public class TbBaseHospitalController {

    @Autowired
    private TbBaseHospitalService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbBaseHospital(@RequestBody tbBaseHospitalEntityWithBLOBs tbBaseHospitalEntityWithBLOBs) throws Exception {
        if(service.addTbBaseHospital(tbBaseHospitalEntityWithBLOBs)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbBaseHospital(@RequestBody tbBaseHospitalEntityWithBLOBs tbBaseHospitalEntityWithBLOBs) throws Exception {
        if(service.updateTbBaseHospital(tbBaseHospitalEntityWithBLOBs)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{hospitalId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbBaseHospitalEntityWithBLOBs> searchTbBaseHospital(@PathVariable("hospitalId") String hospitalId) throws Exception {
        tbBaseHospitalEntityWithBLOBs tbBaseHospitalEntityWithBLOBs = service.findDetailTbBaseHospital(hospitalId);
        MakeResult<tbBaseHospitalEntityWithBLOBs> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbBaseHospitalEntityWithBLOBs == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbBaseHospitalEntityWithBLOBs);
    }

    @RequestMapping(value = "/delete/{hospitalId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbBaseHospital(@PathVariable("hospitalId") String hospitalId) throws Exception {
        if(service.deleteTbBaseHospital(hospitalId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
