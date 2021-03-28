package com.codegym.furama.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CS_Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthday ;
    private String gender;
    private String identity;
    private String phoneNumber;
    private String email;
    private String address;

    @ManyToOne
    @JoinColumn(name = "id_type_customer", nullable = false)
    private CS_TypeCustomer cs_typeCustomer;

    @OneToMany(mappedBy = "cs_customer", cascade = CascadeType.ALL)
    private Set<CT_Contract> ct_contracts;
}
