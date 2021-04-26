package com.codegym.furama.models;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CS_Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Name Not Left Blank")
    private String name;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NotNull(message = "Date Not Null")
    private LocalDate birthday ;

    private String gender;

    @Pattern(regexp = "^([\\d]{9}|[\\d]{12})$", message = "Fail Identity")
    private String identity;

    @Pattern(regexp = "^(84|0[3|5|7|8|9])+([0-9]{8})\\b$", message = "Fail Phone Number")
    private String phoneNumber;

    @Pattern(regexp = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$", message = "Fail Email")
    private String email;

    @NotBlank(message = "Address Not Blank")
    private String address;

    @ManyToOne
    @JoinColumn(name = "id_type_customer", nullable = false)
    private CS_TypeCustomer cs_typeCustomer;

    @OneToMany(mappedBy = "cs_customer", cascade = CascadeType.ALL)
    private Set<CT_Contract> ct_contracts;
}
