package com.psl.training.service;

import com.psl.training.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    static List<Employee> empList = new ArrayList<>();;

    public void initializeEmployees(Employee []emp) {
        for (Employee e: emp) {
            empList.add(e);
        }
    }

    public static List<Employee> getEmpList() {
        return empList;
    }
}
