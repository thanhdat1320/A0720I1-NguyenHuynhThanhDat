package com.codegym.furama.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

//@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class US_Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "us_role", cascade = CascadeType.ALL)
    private Set<US_UserRole> us_userRoles;
}
