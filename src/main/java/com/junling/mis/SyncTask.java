package com.junling.mis;

import com.junling.mis.common.utils.GetUUID32;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SyncTask {
    @Scheduled(cron = "0/5 * * * * *")
    public void myTask() {
        String claimInfoId = GetUUID32.getUUID32();
        System.out.println(claimInfoId);
        System.out.println(" Tasks Examples By Cron: The time is now " + dateFormat().format(new Date()));
    }

    private SimpleDateFormat dateFormat() {
        return new SimpleDateFormat("HH:mm:ss");
    }
}
