package com.example.schedule;

import com.example.service.Judge;
import com.example.service.SendBless;
import com.example.service.BirthdayJudge;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/8/6 23:48
 */
public class SendOnTime {

    public static void main(String[] args) {
        Judge birthDayJudge = new BirthdayJudge();
        SendBless sendBless = new SendBless(birthDayJudge);

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(
                sendBless::sendBlessToEmp, 0, 1, TimeUnit.DAYS
        );
    }
}
