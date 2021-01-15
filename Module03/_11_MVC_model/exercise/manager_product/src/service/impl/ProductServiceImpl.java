package service.impl;

import dao.IProductDAO;
import dao.impl.ProductDAOIpml;
import model.Product;
import service.IProductService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements IProductService {

    private static IProductDAO productDAO = new ProductDAOIpml();

    @Override
    public List<Product> findAll() {
        try {
            return productDAO.getAllProduct();
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public void save(Product product) {
        try {
            productDAO.insertProduct(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Product findById(int id) {
        try {
            return productDAO.getProduct(id);
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public void update(int id, Product product) {
        try {
            productDAO.updateProduct(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(int id) {
        try {
            productDAO.deleteProduct(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> findByName(String name) {
        return this.findAll()
                .stream()
                .filter(product -> product.getName().contains(name))
                .collect(Collectors.toList());
    }
}
