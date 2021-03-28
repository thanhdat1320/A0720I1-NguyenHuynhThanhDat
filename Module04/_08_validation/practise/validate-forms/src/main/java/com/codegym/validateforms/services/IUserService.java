package com.codegym.validateforms.services;

import com.codegym.validateforms.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService {
    Page<User> findAll(Pageable pageable);
    void save(User user);
}
