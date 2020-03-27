package com.junling.mis.model.secondary;

public class sysOperationLogEntityWithBLOBs extends sysOperationLogEntity {
    private String method;

    private String message;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}