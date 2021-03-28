package com.example.formregister.services.impl;
import com.example.formregister.models.Register;
import com.example.formregister.repositories.IRegisterRepository;
import com.example.formregister.services.IRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements IRegisterService {

    @Autowired
    private IRegisterRepository iRegisterRepository;

    @Override
    public Page<Register> findAll(Pageable pageable) {
        return this.iRegisterRepository.findAll(pageable);
    }

    @Override
    public void save(Register register) {
        this.iRegisterRepository.save(register);
    }
}
