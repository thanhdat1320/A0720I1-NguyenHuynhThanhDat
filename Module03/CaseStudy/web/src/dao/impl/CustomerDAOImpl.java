package dao.impl;

import dao.ICustomerDAO;
import model.CS_Customer;
import model.CS_TypeCustomer;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerDAOImpl implements ICustomerDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT_CUSTOMER = "insert into cs_customer(id, name, birthday, gender, identity, phone_number, email, address, id_type_customer) value(?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String GET_CUSTOMER_BY_ID = "select * from cs_customer where id = ?";
    public static final String GET_ALL_CUSTOMER = "select * from cs_customer";
    public static final String DELETE_CUSTOMER = "delete from cs_customer where id = ?";
    public static final String UPDATE_CUSTOMER = "update cs_customer set name = ?, birthday = ?, gender = ?, identity = ?, phone_number = ?, email = ?, address = ?, id_type_customer = ? where id = ?";


    @Override
    public void saveCustomer(CS_Customer customer) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER);
        preparedStatement.setInt(1, customer.getId());
        preparedStatement.setString(2, customer.getName());
        preparedStatement.setString(3, customer.getBirthday());
        preparedStatement.setString(4, customer.getGender());
        preparedStatement.setString(5, customer.getIdentity());
        preparedStatement.setString(6, customer.getPhoneNumber());
        preparedStatement.setString(7, customer.getEmail());
        preparedStatement.setString(8, customer.getAddress());
        preparedStatement.setInt(9, customer.getIdTypeCustomer());
        preparedStatement.executeUpdate();
    }

    @Override
    public CS_Customer getCustomerById(int id) throws SQLException {
        CS_Customer customer = null;
        PreparedStatement preparedStatement = connection.prepareStatement(GET_CUSTOMER_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            String birthday = resultSet.getString("birthday");
            String gender = resultSet.getString("gender");
            String identity = resultSet.getString("identity");
            String phone_number = resultSet.getString("phone_number");
            String email = resultSet.getString("email");
            String address = resultSet.getString("address");
            int id_type_customer = resultSet.getInt("id_type_customer");
            customer = new CS_Customer(id, name, birthday, gender, identity, phone_number, email, address, id_type_customer);
        }
        return customer;
    }

    @Override
    public List<CS_Customer> getAllCustomer() throws SQLException {
        List<CS_Customer> customerList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_CUSTOMER);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String birthday = resultSet.getString("birthday");
            String gender = resultSet.getString("gender");
            String identity = resultSet.getString("identity");
            String phone_number = resultSet.getString("phone_number");
            String email = resultSet.getString("email");
            String address = resultSet.getString("address");
            int id_type_customer = resultSet.getInt("id_type_customer");
            customerList.add(new CS_Customer(id, name, birthday, gender, identity, phone_number, email, address, id_type_customer));
        }
        return customerList;
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateCustomer(CS_Customer customer) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER);
        preparedStatement.setString(1, customer.getName());
        preparedStatement.setString(2, customer.getBirthday());
        preparedStatement.setString(3, customer.getGender());
        preparedStatement.setString(4, customer.getIdentity());
        preparedStatement.setString(5, customer.getPhoneNumber());
        preparedStatement.setString(6, customer.getEmail());
        preparedStatement.setString(7, customer.getAddress());
        preparedStatement.setInt(8, customer.getIdTypeCustomer());
        preparedStatement.setInt(9, customer.getId());
        return preparedStatement.executeUpdate() > 0;
    }


}
