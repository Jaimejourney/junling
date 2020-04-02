package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbHospitalDepartment;
import com.junling.mis.service.primary.TbHospitalDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbHospitalDepartment")
public class TbHospitalDepartmentController {

    @Autowired
    private TbHospitalDepartmentService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbHospitalDepartment(@RequestBody tbHospitalDepartment tbHospitalDepartment) throws Exception {
        if(service.addTbHospitalDepartment(tbHospitalDepartment)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbHospitalDepartment(@RequestBody tbHospitalDepartment tbHospitalDepartment) throws Exception {
        if(service.updateTbHospitalDepartment(tbHospitalDepartment)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{hospitalDepartmentId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbHospitalDepartment> searchTbHospitalDepartment(@PathVariable("hospitalDepartmentId") String hospitalDepartmentId) throws Exception {
        tbHospitalDepartment tbHospitalDepartment = service.findDetailTbHospitalDepartment(hospitalDepartmentId);
        MakeResult<tbHospitalDepartment> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbHospitalDepartment == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbHospitalDepartment);
    }

    @RequestMapping(value = "/delete/{hospitalDepartmentId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbHospitalDepartment(@PathVariable("hospitalDepartmentId") String hospitalDepartmentId) throws Exception {
        if(service.deleteTbHospitalDepartment(hospitalDepartmentId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
