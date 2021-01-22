package dao.impl;

import dao.ICustomerTypeDAO;
import model.CS_TypeCustomer;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeDAOImpl implements ICustomerTypeDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT_TYPE_CUSTOMER = "insert into cs_type_customer(id, name) value(?, ?)";
    public static final String GET_TYPE_CUSTOMER_BY_ID = "select * from cs_type_customer where id = ?";
    public static final String GET_ALL_TYPE_CUSTOMER = "select * from cs_type_customer";
    public static final String DELETE_TYPE_CUSTOMER = "delete from cs_type_customer where id = ?";
    public static final String UPDATE_TYPE_CUSTOMER = "update cs_type_customer name = ? where id = ?";

    @Override
    public void saveTypeCustomer(CS_TypeCustomer typeCustomer) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TYPE_CUSTOMER);
        preparedStatement.setInt(1, typeCustomer.getId());
        preparedStatement.setString(2, typeCustomer.getName());
        preparedStatement.executeUpdate();
    }

    @Override
    public CS_TypeCustomer getTypeCustomerById(int id) throws SQLException {
        CS_TypeCustomer typeCustomer = null;
        PreparedStatement preparedStatement = connection.prepareStatement(GET_TYPE_CUSTOMER_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            typeCustomer = new CS_TypeCustomer(id, name);
        }
        return typeCustomer;
    }

    @Override
    public List<CS_TypeCustomer> getAllTypeCustomer() throws SQLException {
        List<CS_TypeCustomer> typeCustomerList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_TYPE_CUSTOMER);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            typeCustomerList.add(new CS_TypeCustomer(id, name));
        }
        return typeCustomerList;
    }

    @Override
    public boolean deleteTypeCustomer(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_TYPE_CUSTOMER);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateTypeCustomer(CS_TypeCustomer typeCustomer) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_TYPE_CUSTOMER);
        preparedStatement.setString(1, typeCustomer.getName());
        preparedStatement.setInt(2, typeCustomer.getId());
        return preparedStatement.executeUpdate() > 0;
    }
}
