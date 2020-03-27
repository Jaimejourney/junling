package com.junling.mis.service.secondaryImpl;

import com.junling.mis.mapper.secondary.accessTokenEntityMapper;
import com.junling.mis.model.secondary.accessTokenEntity;
import com.junling.mis.service.secondary.AccessTokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("AccessTokenService")
public class AccessTokenServiceImpl implements AccessTokenService {

    private final static Logger LOG = LoggerFactory.getLogger(AccessTokenServiceImpl.class);

    @Autowired
    accessTokenEntityMapper mapper;

    @Override
    public Boolean addAccessToken(accessTokenEntity accessTokenEntity) throws Exception {
        return mapper.insert(accessTokenEntity) > 0;
    }

    @Override
    public Boolean updateAccessToken(accessTokenEntity accessTokenEntity) throws Exception {
        return mapper.updateByPrimaryKey(accessTokenEntity) > 0;
    }

    @Override
    public accessTokenEntity findDetailAccessToken(String id) throws Exception {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public Boolean deleteAccessToken(String id) throws Exception {
        return mapper.deleteByPrimaryKey(id) > 0;
    }
}
