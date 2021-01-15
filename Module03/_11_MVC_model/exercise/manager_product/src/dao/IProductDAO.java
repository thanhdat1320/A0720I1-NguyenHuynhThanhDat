package dao;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductDAO {
    void insertProduct(Product product) throws SQLException;

    Product getProduct(int id) throws SQLException;

    List<Product> getAllProduct() throws SQLException;

    boolean deleteProduct(int id) throws SQLException;

    boolean updateProduct(Product product) throws SQLException;
}
