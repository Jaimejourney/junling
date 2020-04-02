package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbHospitalDepartment;
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
    public MakeResult addTbDepartmentHospital(@RequestBody tbHospitalDepartment tbHospitalDepartment) throws Exception {
        if(service.addTbDepartmentHospital(tbHospitalDepartment)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbDepartmentHospital(@RequestBody tbHospitalDepartment tbHospitalDepartment) throws Exception {
        if(service.updateTbDepartmentHospital(tbHospitalDepartment)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{departmentId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbHospitalDepartment> searchTbDepartmentHospital(@PathVariable("departmentId") String departmentId) throws Exception {
        tbHospitalDepartment tbHospitalDepartment = service.findDetailTbDepartmentHospital(departmentId);
        MakeResult<tbHospitalDepartment> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbHospitalDepartment == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbHospitalDepartment);
    }

    @RequestMapping(value = "/delete/{departmentId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbDepartmentHospital(@PathVariable("departmentId") String departmentId) throws Exception {
        if(service.deleteTbDepartmentHospital(departmentId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
