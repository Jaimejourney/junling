package com.junling.mis.service;

import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.scheduledTasks.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;

@Service
public class SyncTaskService {
    @Autowired
    SynchronizeCustomerInfo synchronizeCustomerInfo;

    @Autowired
    SynchronizeCustomerAction synchronizeCustomerAction;

    @Autowired
    SynchronizeCustomerRelationship synchronizeCustomerRelationship;

    @Autowired
    SynchronizeCustomerBankInfo synchronizeCustomerBankInfo;

    @Autowired
    SynchronizePolicyInfo synchronizePolicyInfo;

    @Autowired
    SynchronizePolicyInsured synchronizePolicyInsured;

    @Autowired
    SynchronizePolicyGradeLevel synchronizePolicyGradeLevel;

    @Autowired
    SynchronizePolicyGradeLevelPro synchronizePolicyGradeLevelPro;

    @Autowired
    SynchronizePolicyBenefit synchronizePolicyBenefit;

    @Autowired
    SynchronizePolicyBeneficiary synchronizePolicyBeneficiary;

    @Autowired
    SynchronizePglProductDuty synchronizePglProductDuty;

    @Autowired
    SynchronizeClaimInfo synchronizeClaimInfo;

    @Autowired
    SynchronizeClaimInvestigatoinInfo synchronizeClaimInvestigatoinInfo;

    //    @Scheduled(cron = "0/5 * * * * *")
    @Scheduled(cron = "0 0 */24 * * *")
    public String myTask() throws ParseException {
//        String str = "2019-03-08 19:08:10";
//        Date date = DatetimeHelper.dateHelper(str);

        //1.客户模块
        synchronizeCustomerInfo.myTask();
        synchronizeCustomerAction.myTask();
        synchronizeCustomerRelationship.myTask();
        synchronizeCustomerBankInfo.myTask();

        //2.保单模块
        synchronizePolicyInfo.myTask();
        synchronizePolicyInsured.myTask();
        synchronizePolicyGradeLevel.myTask();
        synchronizePolicyGradeLevelPro.myTask();
        synchronizePolicyBenefit.myTask();
        synchronizePolicyBeneficiary.myTask();
        synchronizePglProductDuty.myTask();

        //3.理赔模块
        synchronizeClaimInfo.myTask();
        synchronizeClaimInvestigatoinInfo.myTask();

        System.out.println("The time is now " + DatetimeHelper.now());
        return DatetimeHelper.now();
    }
}
