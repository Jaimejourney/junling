//package com.junling.mis.common.utils;
//
//
//import com.junling.mis.common.conf.ConfFactory;
//import com.junling.mis.common.conf.interf.IConf;
//import org.springframework.util.StringUtils;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//
///**
// *
// */
//public class IDFactory {
//
////    Redis待加
//
//    /**
//     * 使用默认参数创建IdWorker
//     * @return
//     */
//    public  static  LongIdWorker createIDWorker() {
//        IConf conf = ConfFactory.createPropertyConfig("id.properties");
//        long workid = conf.getInt("work_id");
//        long datacenter = conf.getInt("data_center");
//
//        return new LongIdWorker(workid, datacenter);
//    }
//
//}
