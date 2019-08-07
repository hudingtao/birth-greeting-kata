package com.example.service;

import org.junit.Before;
import org.junit.Test;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/8/6 23:26
 */
public class BirthDayJudgeTest {
    private BirthdayJudge birthdayJudge;

    @Before
    public void before() {
        birthdayJudge = new BirthdayJudge();
    }

    @Test
    public void testIsNotBirthDay() {

        assert !birthdayJudge.judge("2019/08/02") : "判断错误";
        assert !birthdayJudge.judge("1999/08/02") : "判断错误";
    }

    @Test
    public void testIsRightBirthDay() {
        assert birthdayJudge.judge("2019/08/06") : "判断错误";
        assert birthdayJudge.judge("1999/08/06") : "判断错误";
    }
}
