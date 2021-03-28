package com.codegym.furama.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class US_UserRole {

    @ManyToOne
    @JoinColumn(name = "username", nullable = false)
    private US_UserRole us_userRole;

    @ManyToOne
    @JoinColumn(name = "id_role", nullable = false)
    private US_Role us_role;

}
