package com.junling.mis.service.primaryImpl;



import com.junling.mis.mapper.primary.claimAccountInfoMapper;
import com.junling.mis.model.primary.claimAccountInfo;
import com.junling.mis.model.primary.claimAccountInfoKey;
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
    claimAccountInfoMapper mapper;

    @Override
    public Boolean addClaimAccountInfo(claimAccountInfo claimAccountInfo) throws Exception {
        return mapper.insert(claimAccountInfo) > 0;
    }

    @Override
    public Boolean updateClaimAccountInfo(claimAccountInfo claimAccountInfo) throws Exception {
        return mapper.updateByPrimaryKey(claimAccountInfo) > 0;
    }

    @Override
    public claimAccountInfo findDetailClaimAccountInfo(claimAccountInfoKey key) throws Exception {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public Boolean deleteClaimAccountInfo(claimAccountInfoKey key) throws Exception {
        return mapper.deleteByPrimaryKey(key) > 0;
    }
}