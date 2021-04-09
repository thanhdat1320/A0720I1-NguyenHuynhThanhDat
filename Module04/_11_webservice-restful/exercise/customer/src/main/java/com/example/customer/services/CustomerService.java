package com.example.customer.services;

import com.example.customer.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(int id);

    void save(Customer customer);

    void remove(int id);
}

