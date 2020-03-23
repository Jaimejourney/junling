package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.tbBaseHospitalEntityWithBLOBs;
import com.junling.mis.model.tbBaseHospitalYaofangEntityWithBLOBs;
import com.junling.mis.service.TbBaseHospitalService;
import com.junling.mis.service.TbBaseHospitalYaofangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbBaseHospitalYaofang")
public class TbBaseHospitalYaofangController {

    @Autowired
    private TbBaseHospitalYaofangService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbBaseHospitalYaofang(@RequestBody tbBaseHospitalYaofangEntityWithBLOBs tbBaseHospitalYaofangEntityWithBLOBs) throws Exception {
        if(service.addTbBaseHospitalYaofang(tbBaseHospitalYaofangEntityWithBLOBs)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbBaseHospitalYaofang(@RequestBody tbBaseHospitalYaofangEntityWithBLOBs tbBaseHospitalYaofangEntityWithBLOBs) throws Exception {
        if(service.updateTbBaseHospitalYaofang(tbBaseHospitalYaofangEntityWithBLOBs)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{hospitalId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbBaseHospitalYaofangEntityWithBLOBs> searchTbBaseHospitalYaofang(@PathVariable("hospitalId") String hospitalId) throws Exception {
        tbBaseHospitalYaofangEntityWithBLOBs tbBaseHospitalYaofangEntityWithBLOBs = service.findDetailTbBaseHospitalYaofang(hospitalId);
        MakeResult<tbBaseHospitalYaofangEntityWithBLOBs> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbBaseHospitalYaofangEntityWithBLOBs == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbBaseHospitalYaofangEntityWithBLOBs);
    }

    @RequestMapping(value = "/delete/{hospitalId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbBaseHospitalYaofang(@PathVariable("hospitalId") String hospitalId) throws Exception {
        if(service.deleteTbBaseHospitalYaofang(hospitalId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
