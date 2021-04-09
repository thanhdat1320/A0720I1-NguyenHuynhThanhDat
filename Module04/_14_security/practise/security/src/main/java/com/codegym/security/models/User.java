package com.codegym.security.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id", nullable = false)
    private long idUser;

    @Column(name = "user_name", nullable = false, length = 36)
    private String nameUser;

    @Column(name = "encrypt_password", nullable = false, length = 128)
    private String encryptPassword;

    @Column(name = "enabled", length = 1, nullable = false)
    private boolean enabled;

    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roleSet;
}
