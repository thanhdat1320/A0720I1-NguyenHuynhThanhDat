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
public class SV_Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String area;
    private String floor;
    private String amount;
    private Double cost;
    private String standardRoom;
    private String otherConvenience;
    private Double poolArea;

    @ManyToOne
    @JoinColumn(name = "id_type_service", nullable = false)
    private SV_Type_Service sv_typeService;

    @ManyToOne
    @JoinColumn(name = "id_type_rent", nullable = false)
    private SV_Type_Rent sv_typeRent;

    @OneToMany(mappedBy = "sv_service", cascade = CascadeType.ALL)
    private Set<CT_Contract> ct_contracts;
}
