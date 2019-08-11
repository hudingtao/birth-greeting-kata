package com.example.schedule;

import com.example.manage.EntityManage;
import com.example.service.BirthService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author xiaotao
 * @version 1.0
 */
public class SendOnTime {

    public static void main(String[] args) {
        EntityManage entityManage = new EntityManage();
        BirthService birthService = (BirthService) entityManage.getEntity("BirthService");

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(
                birthService::sendBlessToEmp, 0, 1, TimeUnit.SECONDS
        );
    }
}
