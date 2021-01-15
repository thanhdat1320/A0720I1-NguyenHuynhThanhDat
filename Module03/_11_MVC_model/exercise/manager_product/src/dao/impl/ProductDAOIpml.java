package dao.impl;

import dao.IProductDAO;
import model.Product;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOIpml implements IProductDAO {
    public static Connection connection = DBConnection.getConnection();
    private static final String INSERT_PRODUCT_SQL = "Insert into Products(id, name, provider, price) values (?, ?, ?, ?)";
    private static final String SELECT_PRODUCT_BY_ID = "Select * from Products where id = ?";
    private static final String SELECT_ALL_PRODUCT = "Select * from Products";
    private static final String DELETE_USER_BY_ID = "Delete from Products where id = ?";
    private static final String UPDATE_PRODUCT = "Update Products set name = ?, provider = ?, price = ? where id = ?";


    @Override
    public void insertProduct(Product product) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT_SQL);
        preparedStatement.setInt(1, product.getId());
        preparedStatement.setString(2, product.getName());
        preparedStatement.setString(3, product.getProvider());
        preparedStatement.setString(4, product.getPrice());

        preparedStatement.executeUpdate();
    }

    @Override
    public Product getProduct(int id) throws SQLException {
        Product product = null;
        Connection connection = DBConnection.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            String name = resultSet.getString("name");
            String provider = resultSet.getString("provider");
            String price = resultSet.getString("price");
            product = new Product(id, name, provider, price);
        }
        return product;
    }

    @Override
    public List<Product> getAllProduct() throws SQLException {
        List<Product> productList = new ArrayList<>();

        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String provider = resultSet.getString("provider");
            String price = resultSet.getString("price");

            productList.add(new Product(id, name, provider, price));
        }
        return productList;
    }

    @Override
    public boolean deleteProduct(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER_BY_ID);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateProduct(Product product) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT);
        preparedStatement.setInt(4, product.getId());
        preparedStatement.setString(1, product.getName());
        preparedStatement.setString(2, product.getProvider());
        preparedStatement.setString(3, product.getPrice());

        return preparedStatement.executeUpdate() > 0;
    }
}
