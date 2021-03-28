package com.codegym.furama.services;

import com.codegym.furama.models.CS_TypeCustomer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ICustomerTypeService {
    List<CS_TypeCustomer> findAll();
}
