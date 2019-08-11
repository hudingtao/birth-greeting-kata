package com.example.judge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author xiaotao
 * @version 1.0
 */
public class SpecialBirthdayJudge implements Judge {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    @Override
    public boolean judge(String time) {
        LocalDate birthday = LocalDate.parse(time, DATE_TIME_FORMATTER);
        LocalDate today = LocalDate.now();
        return (birthday.getMonthValue() == 2 && birthday.getDayOfMonth() == 29)
                && !today.isLeapYear()
                && (today.getMonthValue() == 2 && today.getDayOfMonth() == 28);
    }
}

