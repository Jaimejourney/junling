package com.junling.mis.model.secondary;

import java.util.Date;

public class actHiDetailEntity {
    private String id;

    private String type;

    private String procInstId;

    private String executionId;

    private String taskId;

    private String actInstId;

    private String name;

    private String varType;

    private Integer rev;

    private Date time;

    private String bytearrayId;

    private Double double_;

    private Long long_;

    private String text;

    private String text2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getProcInstId() {
        return procInstId;
    }

    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId == null ? null : procInstId.trim();
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId == null ? null : executionId.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getActInstId() {
        return actInstId;
    }

    public void setActInstId(String actInstId) {
        this.actInstId = actInstId == null ? null : actInstId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getVarType() {
        return varType;
    }

    public void setVarType(String varType) {
        this.varType = varType == null ? null : varType.trim();
    }

    public Integer getRev() {
        return rev;
    }

    public void setRev(Integer rev) {
        this.rev = rev;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getBytearrayId() {
        return bytearrayId;
    }

    public void setBytearrayId(String bytearrayId) {
        this.bytearrayId = bytearrayId == null ? null : bytearrayId.trim();
    }

    public Double getDouble() {
        return double_;
    }

    public void setDouble(Double double_) {
        this.double_ = double_;
    }

    public Long getLong() {
        return long_;
    }

    public void setLong(Long long_) {
        this.long_ = long_;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2 == null ? null : text2.trim();
    }
}