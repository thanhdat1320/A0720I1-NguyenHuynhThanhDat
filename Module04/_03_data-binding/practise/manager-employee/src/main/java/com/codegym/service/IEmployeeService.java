package com.codegym.service;

import com.codegym.model.Employee;

import java.util.List;

public interface IEmployeeService {
    void saveEmployee(Employee employee);
    List<Employee> getAllEmployee();
}
