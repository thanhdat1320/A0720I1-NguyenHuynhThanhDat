package com.codegym.furama.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SV_Type_Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private Double price;

    @OneToMany(mappedBy = "sv_typeRent", cascade = CascadeType.ALL)
    private Set<SV_Service> sv_services;
}
