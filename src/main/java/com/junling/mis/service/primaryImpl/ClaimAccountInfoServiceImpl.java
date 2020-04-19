package com.junling.mis.service.primaryImpl;



import com.junling.mis.mapper.primary.ClaimAccountInfoMapper;
import com.junling.mis.model.primary.ClaimAccountInfo;
import com.junling.mis.model.primary.ClaimAccountInfoKey;
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
    ClaimAccountInfoMapper mapper;

    @Override
    public Boolean addClaimAccountInfo(ClaimAccountInfo claimAccountInfo) throws Exception {
        return mapper.insert(claimAccountInfo) > 0;
    }

    @Override
    public Boolean updateClaimAccountInfo(ClaimAccountInfo claimAccountInfo) throws Exception {
        return mapper.updateByPrimaryKey(claimAccountInfo) > 0;
    }

    @Override
    public ClaimAccountInfo findDetailClaimAccountInfo(ClaimAccountInfoKey key) throws Exception {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public Boolean deleteClaimAccountInfo(ClaimAccountInfoKey key) throws Exception {
        return mapper.deleteByPrimaryKey(key) > 0;
    }
}