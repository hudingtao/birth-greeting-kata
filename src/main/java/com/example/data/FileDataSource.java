package com.example.data;

import com.example.model.Employee;
import org.apache.commons.io.IOUtils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaotao
 * @version 1.0
 */
public class FileDataSource implements DataSoure{
    private static final String PATH = FileDataSource.class.getResource("/").getPath() + "employee_records.txt";

    @Override
    public List<Employee> loadData() {
        List<Employee> employees = new ArrayList<>();
        try {
            List<String> lines = IOUtils.readLines(
                    new BufferedInputStream(
                            new FileInputStream(
                                    new File(PATH))), StandardCharsets.UTF_8);
            for (int i = 1; i < lines.size(); i++) {
                String[] info = lines.get(i).split(",");
                Employee employee = new Employee(info[0], info[1], info[2], info[3]);
                employees.add(employee);
            }
        } catch (IOException e) {
            throw new RuntimeException("文件读取失败");
        }
        return employees;
    }
}
