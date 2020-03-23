package com.junling.mis.common.constants;

public class ResultStatus {
    //
    // 以 2 开头的状态码均可认为处理成功
    //
    // 一切正常
    public static final int OK_CODE = 200;
    // 处理成功，但数据可能不正常
    public static final int OK_WITH_DATA_ERROR = 201;

    //
    // 以 3 开头的状态码与权限有关
    // 未登录
    public static final int NOT_LOGIN = 300;
    // 角色未授权
    public static final int ROLE_ERROR = 301;


    //
    // 以 4 开头的状态码为异常
    // 参数错误
    public static final int ERROR_PARAM = 400;
    // 获取结果时出现异常
    public static final int ERROR_RESULT = 401;



}

