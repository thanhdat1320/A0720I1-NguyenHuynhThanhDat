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
public class US_User {
    @Id
    private String username;
    private String password;

    @OneToMany(mappedBy = "us_userRole", cascade = CascadeType.ALL)
    private Set<US_UserRole> us_userRoles;
}
