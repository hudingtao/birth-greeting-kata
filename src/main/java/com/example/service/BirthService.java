package com.example.service;

import com.example.data.DataSoure;
import com.example.email.EmailTool;
import com.example.judge.Judge;
import com.example.model.Employee;

import java.util.List;

/**
 * @author xiaotao
 * @version 1.0
 */
public class BirthService {
    private final DataSoure fileDataSource;
    private final Judge commonBirthDayJudge;
    private final Judge specialBirthDayJudge;
    private final EmailTool emailTool;

    public BirthService(DataSoure fileDataSource,
                        Judge commonBirthDayJudge,
                        Judge specialBirthDayJudge,
                        EmailTool emailTool) {
        this.fileDataSource = fileDataSource;
        this.commonBirthDayJudge = commonBirthDayJudge;
        this.specialBirthDayJudge = specialBirthDayJudge;
        this.emailTool = emailTool;
    }

    public void sendBlessToEmp() {
        List<Employee> employees = fileDataSource.loadData();

        employees.forEach(employee -> {
            String dateOfBirth = employee.getDateOfBirth().trim();
            if (commonBirthDayJudge.judge(dateOfBirth) || specialBirthDayJudge.judge(dateOfBirth)) {
                String content = "Subject: Happy birthday!" +
                        System.lineSeparator() +
                        "Happy birthday, dear " +
                        employee.getFirstName() +
                        "!";
                emailTool.send(content, employee.getEmail());
            }
        });
    }
}
