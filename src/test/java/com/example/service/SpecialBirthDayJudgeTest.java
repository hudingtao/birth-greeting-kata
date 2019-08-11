package com.example.service;

import com.example.judge.Judge;
import com.example.manage.EntityManage;
import org.junit.Before;
import org.junit.Test;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/8/6 23:26
 */
public class SpecialBirthDayJudgeTest {
    private Judge specialBirthdayJudge;

    @Before
    public void before() {
        this.specialBirthdayJudge = (Judge) new EntityManage().getEntity("SpecialBirthdayJudge");
    }

    @Test
    public void testIsNotBirthDay() {

        assert !this.specialBirthdayJudge.judge("2019/08/02") : "判断错误1";
        assert !this.specialBirthdayJudge.judge("1999/08/02") : "判断错误2";
    }

    @Test
    public void testIsRightBirthDay() {
        assert this.specialBirthdayJudge.judge("2019/02/29") : "判断错误1";
        assert this.specialBirthdayJudge.judge("1999/02/29") : "判断错误2";
    }
}
