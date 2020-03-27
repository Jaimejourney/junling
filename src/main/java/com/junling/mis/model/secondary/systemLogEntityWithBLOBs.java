package com.junling.mis.model.secondary;

public class systemLogEntityWithBLOBs extends systemLogEntity {
    private String requestArguments;

    private String responseException;

    private String responseResult;

    public String getRequestArguments() {
        return requestArguments;
    }

    public void setRequestArguments(String requestArguments) {
        this.requestArguments = requestArguments == null ? null : requestArguments.trim();
    }

    public String getResponseException() {
        return responseException;
    }

    public void setResponseException(String responseException) {
        this.responseException = responseException == null ? null : responseException.trim();
    }

    public String getResponseResult() {
        return responseResult;
    }

    public void setResponseResult(String responseResult) {
        this.responseResult = responseResult == null ? null : responseResult.trim();
    }
}