package com.codegym.furama.services.impl;

import com.codegym.furama.models.CS_Customer;
import com.codegym.furama.repositories.ICustomerRepositories;
import com.codegym.furama.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerRepositories iCustomerRepositories;

    @Override
    public Page<CS_Customer> findAll(Pageable pageable) {
        return this.iCustomerRepositories.findAll(pageable);
    }

    @Override
    public CS_Customer save(CS_Customer cs_customer) {
        return  this.iCustomerRepositories.save(cs_customer);
    }

    @Override
    public void delete(int id) {
        this.iCustomerRepositories.deleteById(id);
    }

    @Override
    public CS_Customer findById(int id) {
        return this.iCustomerRepositories.findById(id).orElse(null);
    }

    @Override
    public Page<CS_Customer> search(String keyword, Pageable pageable) {
        List<CS_Customer> customerList = this.iCustomerRepositories.findAll().stream().filter(cs_customer -> cs_customer.getName().contains(keyword)).collect(Collectors.toList());
        int start = (int) pageable.getOffset();
        int end = (int) (start + pageable.getPageSize()) > customerList.size() ? customerList.size() : (start + pageable.getPageSize());
        Page<CS_Customer> page = new PageImpl<>(customerList.subList(start, end), pageable, customerList.size());
        return page;
    }

}
