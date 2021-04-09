package com.code.basket.services;


import com.code.basket.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    void save(Product product);
    void delete(int id);
    List<Product> search(String name);
}