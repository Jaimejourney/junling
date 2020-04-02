package com.junling.mis.common.utils;

import java.util.UUID;


public class GetUUID32 {
    public static String getUUID32() {
        StringBuilder sb = new StringBuilder();
        sb.append("JL");
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        sb.append(uuid.substring(0,10));
        return sb.toString();
    }
}
