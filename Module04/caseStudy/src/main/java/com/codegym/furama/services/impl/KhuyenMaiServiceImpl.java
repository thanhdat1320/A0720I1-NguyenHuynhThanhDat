package com.codegym.furama.services.impl;

import com.codegym.furama.models.KhuyenMai;
import com.codegym.furama.repositories.KhuyenMaiRepository;
import com.codegym.furama.services.KhuyenMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KhuyenMaiServiceImpl implements KhuyenMaiService {

    @Autowired
    private KhuyenMaiRepository khuyenMaiRepository;

    @Override
    public List<KhuyenMai> findAll() {
        return this.khuyenMaiRepository.findAll();
    }

    @Override
    public KhuyenMai save(KhuyenMai khuyenMai) {
        return this.khuyenMaiRepository.save(khuyenMai);
    }

    @Override
    public void delete(int id) {
        this.khuyenMaiRepository.deleteById(id);
    }

    @Override
    public KhuyenMai findById(int id) {
        return this.khuyenMaiRepository.findById(id).orElse(null);
    }

    @Override
    public List<KhuyenMai> search(String keyword) {
        return this.khuyenMaiRepository.findAll().stream().filter(khuyenMai -> khuyenMai.getThoiGianBatDau().equals(keyword)).collect(Collectors.toList());
    }

    @Override
    public List<KhuyenMai> searchByDiscount(int discount) {
        return this.khuyenMaiRepository.findAll().stream().filter(khuyenMai -> khuyenMai.getMucGiamGia() == discount).collect(Collectors.toList());
    }
}
