package com.code.basket.services.impl;
import com.code.basket.models.Product;
import com.code.basket.repositories.ProductRepository;
import com.code.basket.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return this.productRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public void delete(int id) {
        this.productRepository.deleteById(id);
    }

    @Override
    public List<Product> search(String name) {
        return this.findAll().stream().filter(product -> product.getName().contains(name)).collect(Collectors.toList());
    }
}
