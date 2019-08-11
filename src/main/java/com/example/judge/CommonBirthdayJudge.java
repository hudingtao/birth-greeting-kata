package com.example.judge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author xiaotao
 * @version 1.0
 */
public class CommonBirthdayJudge implements Judge {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    @Override
    public boolean judge(String time) {
        LocalDate birthday = LocalDate.parse(time, DATE_TIME_FORMATTER);
        return birthday.getDayOfYear() == LocalDate.now().getDayOfYear();
    }
}
