package com.example.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/8/6 23:52
 */
public class BirthdayJudge implements Judge {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    @Override
    public boolean judge(String time) {
        LocalDateTime birthday = LocalDateTime.parse(time+" 00:00:00", DATE_TIME_FORMATTER);
        return birthday.getDayOfYear() == LocalDateTime.now().getDayOfYear();
    }
}
