package com.codegym.furama.repositories;

import com.codegym.furama.models.CS_Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepositories extends JpaRepository<CS_Customer, Integer> {
    Page<CS_Customer> findAll(Pageable pageable);
}
