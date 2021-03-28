package com.example.validationcustomphonenumber.models;

import com.example.validationcustomphonenumber.validation.PhoneNumberValidation;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @PhoneNumberValidation
    private String phoneNumber;
}
