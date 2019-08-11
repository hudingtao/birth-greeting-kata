package com.example.data;

import com.example.model.Employee;

import java.util.List;

/**
 * @author xiaotao
 * @version 1.0
 */
public interface DataSoure {

    List<Employee> loadData();
}
