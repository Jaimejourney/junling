package com.junling.mis.service.secondaryImpl;

import com.junling.mis.mapper.secondary.AccessTokenEntityMapper;
import com.junling.mis.model.secondary.AccessTokenEntity;
import com.junling.mis.service.secondary.AccessTokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("AccessTokenService")
public class AccessTokenServiceImpl implements AccessTokenService {

    private final static Logger LOG = LoggerFactory.getLogger(AccessTokenServiceImpl.class);

    @Autowired
    AccessTokenEntityMapper mapper;

    @Override
    public Boolean addAccessToken(AccessTokenEntity accessTokenEntity) throws Exception {
        return mapper.insert(accessTokenEntity) > 0;
    }

    @Override
    public Boolean updateAccessToken(AccessTokenEntity accessTokenEntity) throws Exception {
        return mapper.updateByPrimaryKey(accessTokenEntity) > 0;
    }

    @Override
    public AccessTokenEntity findDetailAccessToken(String id) throws Exception {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public Boolean deleteAccessToken(String id) throws Exception {
        return mapper.deleteByPrimaryKey(id) > 0;
    }
}
