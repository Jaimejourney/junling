package com.junling.mis.common.utils;

import java.util.UUID;

public class GetUUID32 {
    public static String getUUID32(){
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        return uuid;
    }
}
