package com.example.formregister.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;


@Entity
@Data
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min = 5, max = 45)
    @NotNull(message = "First name left blank ")
    private String firstName;

    @Size(min = 5, max = 45)
    @NotNull(message = "Last name left blank ")
    private String lastName;

    @Min(value = 18, message = "You are under 18 years of age")
    private int age;

    @Pattern(regexp = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$", message = "fail email")
    private String email;
}
