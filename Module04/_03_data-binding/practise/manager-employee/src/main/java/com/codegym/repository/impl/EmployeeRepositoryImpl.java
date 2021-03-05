package com.codegym.repository.impl;

import com.codegym.model.Employee;
import com.codegym.repository.IEmployeeRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements IEmployeeRepository {
    private static List<Employee> employeeList;
    static {
        employeeList = new ArrayList<>();

        Employee employee = new Employee();
        employee.setId("1");
        employee.setName("Dat");
        employee.setContactNumber("EP1");
        employeeList.add(employee);

        Employee employee2 = new Employee();
        employee2.setId("2");
        employee2.setName("Long");
        employee2.setContactNumber("EP2");
        employeeList.add(employee2);

        Employee employee3 = new Employee();
        employee3.setId("3");
        employee3.setName("Trung");
        employee3.setContactNumber("EP3");
        employeeList.add(employee3);
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeList;
    }
}
