package com.codegym.validateforms.services.impl;

import com.codegym.validateforms.models.User;
import com.codegym.validateforms.repositories.IUserRepository;
import com.codegym.validateforms.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;


    @Override
    public Page<User> findAll(Pageable pageable) {
        return this.iUserRepository.findAll(pageable);
    }

    @Override
    public void save(User user) {
        this.iUserRepository.save(user);
    }
}
