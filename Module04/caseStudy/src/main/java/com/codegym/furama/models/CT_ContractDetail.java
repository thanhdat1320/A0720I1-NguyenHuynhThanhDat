package com.codegym.furama.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CT_ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int amount;

    @ManyToOne
    @JoinColumn(name = "id_contract", nullable = false)
    private CT_Contract ct_contract;

    @ManyToOne
    @JoinColumn(name = "id_service_include", nullable = false)
    private CT_ServiceInclude ct_serviceInclude;
}
