package com.codegym.furama.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CT_Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date start;
    private Date end;
    private Double deposit;
    private Double total;

    @ManyToOne
    @JoinColumn(name = "id_customer", nullable = false)
    private CS_Customer cs_customer;

    @ManyToOne
    @JoinColumn(name = "id_employee", nullable = false)
    private EP_Employee ep_employee;

    @ManyToOne
    @JoinColumn(name = "id_service", nullable = false)
    private SV_Service sv_service;

    @OneToMany(mappedBy = "ct_contract", cascade = CascadeType.ALL)
    private Set<CT_ContractDetail> ct_contractDetails;
}
