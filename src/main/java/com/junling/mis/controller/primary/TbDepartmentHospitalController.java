package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbDepartmentHospitalEntity;
import com.junling.mis.service.primary.TbDepartmentHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbDepartmentHospital")
public class TbDepartmentHospitalController {

    @Autowired
    private TbDepartmentHospitalService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbDepartmentHospital(@RequestBody tbDepartmentHospitalEntity tbDepartmentHospitalEntity) throws Exception {
        if(service.addTbDepartmentHospital(tbDepartmentHospitalEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbDepartmentHospital(@RequestBody tbDepartmentHospitalEntity tbDepartmentHospitalEntity) throws Exception {
        if(service.updateTbDepartmentHospital(tbDepartmentHospitalEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{departmentId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbDepartmentHospitalEntity> searchTbDepartmentHospital(@PathVariable("departmentId") Integer departmentId) throws Exception {
        tbDepartmentHospitalEntity tbDepartmentHospitalEntity = service.findDetailTbDepartmentHospital(departmentId);
        MakeResult<tbDepartmentHospitalEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbDepartmentHospitalEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbDepartmentHospitalEntity);
    }

    @RequestMapping(value = "/delete/{departmentId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbDepartmentHospital(@PathVariable("departmentId") Integer departmentId) throws Exception {
        if(service.deleteTbDepartmentHospital(departmentId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
