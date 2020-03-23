package com.junling.mis.common.dateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatetimeHelper {
    /**
     * 获取当前时间
     *  YYYY-MM-dd hh:mm:ss
     * @return
     */
    public static String now() {
        Date dnow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        return format.format(dnow);
    }
}
