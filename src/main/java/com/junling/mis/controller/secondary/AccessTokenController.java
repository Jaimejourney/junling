package com.junling.mis.controller.secondary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.secondary.AccessTokenEntity;
import com.junling.mis.service.secondary.AccessTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/accessToken")
public class AccessTokenController {

    @Autowired
    private AccessTokenService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addAccessToken(@RequestBody AccessTokenEntity accessTokenEntity) throws Exception {
        if(service.addAccessToken(accessTokenEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateAccessToken(@RequestBody AccessTokenEntity accessTokenEntity) throws Exception {
        if(service.updateAccessToken(accessTokenEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{id}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<AccessTokenEntity> searchAccessToken(@PathVariable("id") String id) throws Exception {
        AccessTokenEntity accessTokenEntity = service.findDetailAccessToken(id);
        MakeResult<AccessTokenEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(accessTokenEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(accessTokenEntity);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delAccessToken(@PathVariable("id") String id) throws Exception {
       if(service.deleteAccessToken(id)){
           return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
           return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
       }
    }
}
