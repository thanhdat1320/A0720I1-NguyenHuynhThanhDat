package dao;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerDAO {
    void saveCustomer(Customer customer) throws SQLException;

    List<Customer> getAllCustomer() throws SQLException;

    String findMaxId() throws SQLException;
}
