package com.codegym.security.repositories;

import com.codegym.security.models.Role;
import com.codegym.security.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByNameUser(String userName);
}
