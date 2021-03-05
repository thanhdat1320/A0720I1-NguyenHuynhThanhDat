package com.codegym.repository;
import com.codegym.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    void saveEmployee(Employee employee);

    List<Employee> getAllEmployee();
}
