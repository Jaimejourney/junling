package com.junling.mis.common.dateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatetimeHelper {
    /**
     * 获取当前时间
     * YYYY-MM-dd hh:mm:ss
     *
     * @return
     */
    public static String now() {
        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        return format.format(now);
    }

    public static Date scheduledDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        date = calendar.getTime();
        return date;
    }

    public static Date dateHelper(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = (Date) sdf.parse(str);
        return date;
    }

    public static Date dateTransferHelper(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = (Date) sdf.parse(str);
        return date;
    }
}
