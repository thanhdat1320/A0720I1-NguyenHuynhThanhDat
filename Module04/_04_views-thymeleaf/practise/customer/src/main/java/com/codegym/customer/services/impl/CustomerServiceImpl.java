package com.codegym.customer.services.impl;

import com.codegym.customer.models.Customer;
import com.codegym.customer.repositories.ICustomerRepository;
import com.codegym.customer.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public List<Customer> fillAll() {
        return this.iCustomerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        this.iCustomerRepository.save(customer);
    }

    @Override
    public void delete(int id) {
        this.iCustomerRepository.delete(this.fillById(id));
    }

    @Override
    public Customer fillById(int id) {
        return this.iCustomerRepository.findById(id).orElse(null);
    }
}
