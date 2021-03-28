package com.example.validationcustomphonenumber.repositories;

import com.example.validationcustomphonenumber.models.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhoneNumberRepo extends JpaRepository<PhoneNumber, Integer> {
}
