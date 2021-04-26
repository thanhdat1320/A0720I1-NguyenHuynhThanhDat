package com.codegym.furama.services;

import com.codegym.furama.models.CS_Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<CS_Customer> findAll(Pageable pageable);
    CS_Customer save(CS_Customer cs_customer);
    void delete(int id);
    CS_Customer findById(int id);

    Page<CS_Customer> search(String keyword, Pageable pageable);

}
