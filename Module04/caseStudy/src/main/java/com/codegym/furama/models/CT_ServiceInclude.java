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
@AllArgsConstructor
@NoArgsConstructor
public class CT_ServiceInclude {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int unit;
    private Double price;
    private String status;

    @OneToMany(mappedBy = "ct_serviceInclude", cascade = CascadeType.ALL)
    private Set<CT_ContractDetail> ct_contractDetails;
}
