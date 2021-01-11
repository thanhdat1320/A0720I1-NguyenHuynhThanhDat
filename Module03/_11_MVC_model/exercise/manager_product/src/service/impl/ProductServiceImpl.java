package service.impl;

import model.Product;
import service.IProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductServiceImpl implements IProductService {

    private static Map<Integer, Product> products;
        static {
            products = new HashMap<>();
            products.put(1, new Product(1, "iPhone 12 Pro Max", "Apple","22000000"));
            products.put(2, new Product(2, "Samsung Galaxy note 20", "Samsung","29000000"));
            products.put(3, new Product(3, "redmi note 8", "Xiaomi","15000000"));
            products.put(4, new Product(4, "OPPO Reno5", "Oppo","8000000"));
            products.put(5, new Product(5, "Nokia 5.4", "Nokia","3000000"));
        }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        return products.values()
                .stream()
                .filter(product -> product.getName().contains(name))
                .collect(Collectors.toList());
    }
}
