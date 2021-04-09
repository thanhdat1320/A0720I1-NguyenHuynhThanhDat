package com.code.basket.controllers;


import com.code.basket.models.Product;
import com.code.basket.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductControllerUseFul {
    private static Map<Product, Integer> productIntegerMap = new HashMap<>();

    @Autowired
    private ProductService productService;

    @GetMapping(value = {"/", "/product"})
    public ResponseEntity<List<Product>> productResponseEntity() {
        List<Product> productList = this.productService.findAll();
        if (productList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") int id) {
        Product product = this.productService.findById(id);
        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping("/product")
    public ResponseEntity<Void> createProduct(@RequestBody Product product) {
        this.productService.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") int id, @RequestBody Product product) {
        Product productCurrent = this.productService.findById(id);
        if (productCurrent == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        product.setId(productCurrent.getId());
        this.productService.save(product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable("id") int id) {
        Product product = this.productService.findById(id);
        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        this.productService.delete(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

}
