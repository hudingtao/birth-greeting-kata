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
public class CommonBirthDayJudgeTest {
    private Judge commonBirthdayJudge;

    @Before
    public void before() {
        this.commonBirthdayJudge = (Judge) new EntityManage().getEntity("CommonBirthdayJudge");
    }

    @Test
    public void testIsNotBirthDay() {

        assert !this.commonBirthdayJudge.judge("2019/08/02") : "判断错误1";
        assert !this.commonBirthdayJudge.judge("1999/08/02") : "判断错误2";
    }

    @Test
    public void testIsRightBirthDay() {
        assert this.commonBirthdayJudge.judge("2019/08/10") : "判断错误1";
        assert this.commonBirthdayJudge.judge("1999/08/10") : "判断错误2";
    }
}
