package com.junling.mis.model.secondary;

public class testProductEntity {
    private String channelName;

    private String channelName1;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getChannelName1() {
        return channelName1;
    }

    public void setChannelName1(String channelName1) {
        this.channelName1 = channelName1 == null ? null : channelName1.trim();
    }
}