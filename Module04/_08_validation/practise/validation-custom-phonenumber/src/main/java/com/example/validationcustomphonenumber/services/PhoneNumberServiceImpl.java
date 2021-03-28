package com.example.validationcustomphonenumber.services;

import com.example.validationcustomphonenumber.models.PhoneNumber;
import com.example.validationcustomphonenumber.repositories.IPhoneNumberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneNumberServiceImpl implements IPhoneNumberService {

    @Autowired
    private IPhoneNumberRepo iPhoneNumberRepo;

    @Override
    public List<PhoneNumber> getList() {
        return this.iPhoneNumberRepo.findAll();
    }
}
