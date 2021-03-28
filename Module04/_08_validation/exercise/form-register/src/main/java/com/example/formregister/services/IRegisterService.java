package com.example.formregister.services;

import com.example.formregister.models.Register;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IRegisterService {
    Page<Register> findAll(Pageable pageable);
    void save(Register register);
}
