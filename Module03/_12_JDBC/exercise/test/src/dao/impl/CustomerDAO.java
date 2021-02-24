package dao.impl;

import dao.ICustomerDAO;
import model.Customer;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO  implements ICustomerDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT = "insert into customer(id, name, email) value(?, ?, ?)";
    public static final String GET_ALL = "select * from customer";

    @Override
    public void saveCustomer(Customer customer) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT);
        PreparedStatement preparedStatement2 = connection.prepareStatement("select max(id) as max from customer");

        int idMax = preparedStatement2.executeUpdate();
        preparedStatement.setString(1, customer.getId());
        preparedStatement.setString(2, customer.getName());
        preparedStatement.setString(3, customer.getEmail());
        preparedStatement.executeUpdate();
    }

    @Override
    public List<Customer> getAllCustomer() throws SQLException {
        List<Customer> customerList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL);

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            customerList.add(new Customer(id, name, email ));
        }
        return customerList;
    }

    @Override
    public String findMaxId() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("select max(id) as max from customer");
        return null;
    }
}
