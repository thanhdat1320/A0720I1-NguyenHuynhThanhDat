package com.codegym.furama.services.impl;

import com.codegym.furama.models.CS_TypeCustomer;
import com.codegym.furama.repositories.ICustomerTypeRepositories;
import com.codegym.furama.services.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements ICustomerTypeService {

    @Autowired
    private ICustomerTypeRepositories iCustomerTypeRepositories;

    @Override
    public List<CS_TypeCustomer> findAll() {
        return this.iCustomerTypeRepositories.findAll();
    }
}
