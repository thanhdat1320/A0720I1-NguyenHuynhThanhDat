package com.codegym.furama.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EP_Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthday ;
    private String identity;
    private String phoneNumber;
    private String email;
    private String salary;
    private String address;

    @ManyToOne
    @JoinColumn(name = "id_department_employee", nullable = false)
    private EP_DepartmentEmployee ep_departmentEmployee;

    @ManyToOne
    @JoinColumn(name = "id_level_employee", nullable = false)
    private EP_LevelEmployee ep_levelEmployee;

    @ManyToOne
    @JoinColumn(name = "id_position_employee", nullable = false)
    private EP_PositionEmployee ep_positionEmployee;

    @OneToMany(mappedBy = "ep_employee", cascade = CascadeType.ALL)
    private Set<CT_Contract> ct_contracts;
}
