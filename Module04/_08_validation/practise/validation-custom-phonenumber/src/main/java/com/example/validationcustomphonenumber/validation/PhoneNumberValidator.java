package com.example.validationcustomphonenumber.validation;

import com.example.validationcustomphonenumber.models.PhoneNumber;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumberValidation, PhoneNumber> {
    @Override
    public void initialize(PhoneNumberValidation constraintAnnotation) {
    }

    @Override
    public boolean isValid(PhoneNumber phoneNumber, ConstraintValidatorContext context) {
        return phoneNumber.getPhoneNumber() != null && phoneNumber.getPhoneNumber().matches("[0-9]+") && (phoneNumber.getPhoneNumber().length() > 8) && (phoneNumber.getPhoneNumber().length() < 14);
    }
}
