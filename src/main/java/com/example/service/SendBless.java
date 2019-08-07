package com.example.service;

import com.example.model.Employee;
import com.example.utils.EmailUtil;
import com.example.utils.FileUtil;

import java.util.List;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/8/6 23:38
 */
public class SendBless {
    private Judge birthDayJudge;

    public SendBless(Judge birthDayJudge) {
        this.birthDayJudge = birthDayJudge;
    }

    public void sendBlessToEmp() {
        List<Employee> employees = FileUtil.loadData();
        employees.forEach(employee -> {
            if (birthDayJudge.judge(employee.getDateOfBirth().trim())) {
                String content = "Subject: Happy birthday!" +
                        System.lineSeparator() +
                        "Happy birthday, dear " +
                        employee.getFirstName() +
                        "!";
                EmailUtil.sendEmail(content, employee.getEmail());
            }
        });
    }
}
