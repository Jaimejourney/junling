package com.junling.mis.service.secondary;


import com.junling.mis.model.secondary.accessTokenEntity;

/**
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface AccessTokenService {

    Boolean addAccessToken(accessTokenEntity AccessTokenEntity) throws Exception;

    Boolean updateAccessToken(accessTokenEntity AccessTokenEntity) throws Exception;
//
    accessTokenEntity findDetailAccessToken(String id) throws Exception;
//
//    Result listAccessToken(AccessTokenModel AccessTokenModel) throws Exception;
//
//    Result listAccessTokenPage(AccessTokenModel AccessTokenModel) throws Exception;
//
//    Result countAccessToken(AccessTokenModel AccessTokenModel) throws Exception;
//
    Boolean deleteAccessToken(String id) throws Exception;
}
