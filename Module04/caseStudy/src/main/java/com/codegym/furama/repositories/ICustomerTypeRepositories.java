package com.codegym.furama.repositories;

import com.codegym.furama.models.CS_TypeCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerTypeRepositories extends JpaRepository<CS_TypeCustomer, Integer> {
}
