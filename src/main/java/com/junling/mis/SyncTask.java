package com.junling.mis;

import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.secondary.visitRecordEntityMapper;
import com.junling.mis.model.secondary.visitRecordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class SyncTask {
    @Autowired
    visitRecordEntityMapper visitRecordEntityMapper;


    @Scheduled(cron = "0/5 * * * * *")
    public void myTask() throws ParseException {
        String claimInfoId = GetUUID32.getUUID32();
        System.out.println(claimInfoId);

//        String str="2019-03-08 19:08:10";
//        Date date =  DatetimeHelper.dateHelper(str);
//        List<visitRecordEntity> list = visitRecordEntityMapper.search(date);
//        System.out.println(list.size());
        System.out.println(" Tasks Examples By Cron: The time is now " + dateFormat().format(new Date()));
    }

    private SimpleDateFormat dateFormat() {
        return new SimpleDateFormat("HH:mm:ss");
    }
}
