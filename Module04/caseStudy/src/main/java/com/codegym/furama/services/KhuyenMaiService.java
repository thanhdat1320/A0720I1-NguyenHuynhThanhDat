package com.codegym.furama.services;

import com.codegym.furama.models.KhuyenMai;


import java.util.List;

public interface KhuyenMaiService {
    List<KhuyenMai> findAll();
    KhuyenMai save(KhuyenMai khuyenMai);
    void delete(int id);
    KhuyenMai findById(int id);

    List<KhuyenMai> search(String keyword);

    List<KhuyenMai> searchByDiscount(int discount);
}
