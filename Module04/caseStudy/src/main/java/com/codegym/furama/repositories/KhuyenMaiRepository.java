package com.codegym.furama.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhuyenMaiRepository extends JpaRepository<com.codegym.furama.models.KhuyenMai, Integer> {
}
