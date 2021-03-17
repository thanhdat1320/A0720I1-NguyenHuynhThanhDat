package com.codegym.customer.services;

import com.codegym.customer.models.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> fillAll();
    void save(Customer customer);
    void delete(int id);
    Customer fillById(int id);
}
