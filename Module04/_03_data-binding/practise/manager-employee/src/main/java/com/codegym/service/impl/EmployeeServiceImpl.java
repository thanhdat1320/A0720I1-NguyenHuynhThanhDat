package com.codegym.service.impl;

import com.codegym.model.Employee;
import com.codegym.repository.IEmployeeRepository;
import com.codegym.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    @Override
    public void saveEmployee(Employee employee) {
        this.iEmployeeRepository.saveEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return this.iEmployeeRepository.getAllEmployee();
    }
}
