package com.example.service;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/8/10 23:21
 */
public class LocalDateTest {
    private LocalDate today;
    private LocalDate specialDay;

    @Before
    public void setToday() {
        this.today = LocalDate.now();
        this.specialDay = LocalDate.of(2000, 02, 29);
    }

    @Test
    public void testIsSpecialDay() {
        assert !(today.getMonthValue() == 2 && today.getDayOfMonth() == 29) : "不是特殊日期";
        assert specialDay.getMonthValue() == 2 && specialDay.getDayOfMonth() == 29 : "是特殊日期";
    }

    @Test
    public void testLeapYear() {
        assert !LocalDate.now().isLeapYear() : "判断有误1";
        assert specialDay.isLeapYear() : "判断有误2";
    }

    @Test
    public void testSendDay() {
        assert !((specialDay.getMonthValue() == 2 && specialDay.getDayOfMonth() == 29)
                && !today.isLeapYear()
                && (today.getMonthValue() == 2 && today.getDayOfMonth() == 28))
                : "特殊生日时，在2月28日发送邮件，判断有误1";

        assert (specialDay.getMonthValue() == 2 && specialDay.getDayOfMonth() == 29)
                && !today.isLeapYear()
                && (today.getMonthValue() == 8 && today.getDayOfMonth() == 11)
                : "特殊生日时，在2月28日发送邮件，判断有误2";
    }
}
