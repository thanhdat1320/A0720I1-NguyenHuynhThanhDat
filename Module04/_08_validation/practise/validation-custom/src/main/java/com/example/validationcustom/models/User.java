package com.example.validationcustom.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @NotNull(message = "username ko dc de trong")
    @NotBlank(message = "username ko dc co khoang trong")
    private String username;

    @NotNull
    private String password;

    private String firstName ;

    private String lastName ;
}
