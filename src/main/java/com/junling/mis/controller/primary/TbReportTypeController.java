package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.TbReportType;
import com.junling.mis.service.primary.TbReportTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbReportType")
public class TbReportTypeController {

    @Autowired
    private TbReportTypeService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbReportType(@RequestBody TbReportType tbReportType) throws Exception {
        if(service.addTbReportType(tbReportType)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbReportType(@RequestBody TbReportType tbReportType) throws Exception {
        if(service.updateTbReportType(tbReportType)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{reportTypeCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<TbReportType> searchTbReportType(@PathVariable("reportTypeCode") String reportTypeCode) throws Exception {
        TbReportType tbReportType = service.findDetailTbReportType(reportTypeCode);
        MakeResult<TbReportType> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbReportType == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbReportType);
    }

    @RequestMapping(value = "/delete/{reportTypeCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbReportType(@PathVariable("reportTypeCode") String reportTypeCode) throws Exception {
        if(service.deleteTbReportType(reportTypeCode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }
}
