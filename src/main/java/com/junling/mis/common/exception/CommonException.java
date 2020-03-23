package com.junling.mis.common.exception;

public class CommonException extends RuntimeException{
    /**
     *
     */
    private static final long serialVersionUID = -315349147655555522L;
    private static final String DEFAULT_ERROR_CODE="-1";

    private final String errorCode;

    public CommonException(String message){
        super(message);
        this.errorCode = DEFAULT_ERROR_CODE;
    }

    public CommonException(Throwable throwable){
        super(throwable);
        this.errorCode = DEFAULT_ERROR_CODE;
    }

    public CommonException(String message, String errorCode){
        super(message);
        this.errorCode = errorCode;
    }

    public CommonException(String message, String errorCode, Throwable throwable){
        super(message, throwable);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
