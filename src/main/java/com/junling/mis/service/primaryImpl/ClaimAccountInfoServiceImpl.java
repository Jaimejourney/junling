package com.junling.mis.service.primaryImpl;



import com.junling.mis.mapper.primary.claimAccountInfoEntityMapper;
import com.junling.mis.model.primary.claimAccountInfoEntity;
import com.junling.mis.service.primary.ClaimAccountInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("claimAccountInfoService")
public class ClaimAccountInfoServiceImpl implements ClaimAccountInfoService {

    private final static Logger LOG = LoggerFactory.getLogger(ClaimAccountInfoServiceImpl.class);

    @Autowired
    claimAccountInfoEntityMapper mapper;

    @Override
    public Boolean addClaimAccountInfo(claimAccountInfoEntity claimAccountInfoEntity) throws Exception {
        return mapper.insert(claimAccountInfoEntity) > 0;
    }

    @Override
    public Boolean updateClaimAccountInfo(claimAccountInfoEntity claimAccountInfoEntity) throws Exception {
        return mapper.updateByPrimaryKey(claimAccountInfoEntity) > 0;
    }

    @Override
    public claimAccountInfoEntity findDetailClaimAccountInfo(String accountId) throws Exception {
        return mapper.selectByPrimaryKey(accountId);
    }

    @Override
    public Boolean deleteClaimAccountInfo(String accountId) throws Exception {
        return mapper.deleteByPrimaryKey(accountId) > 0;
    }

}