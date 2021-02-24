package dao.impl;

import dao.IContractIncludeServiceDAO;
import model.CT_ContractDetail;
import model.CT_ServiceInclude;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractIncludeServiceDAOImpl implements IContractIncludeServiceDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT_CONTRACT_INCLUDE_SERVICE = "insert into ct_services_include(id, name, unit, price, status) value(?, ?, ?, ?, ?)";
    public static final String GET_CONTRACT_INCLUDE_SERVICE_BY_ID = "select * from ct_services_include where id = ?";
    public static final String GET_ALL_CONTRACT_INCLUDE_SERVICE = "select * from ct_services_include";
    public static final String DELETE_CONTRACT_INCLUDE_SERVICE = "delete from ct_services_include where id = ?";
    public static final String UPDATE_CONTRACT_INCLUDE_SERVICE = "update ct_services_include set name = ?, unit = ?, price = ?, status = ? where id = ?";

    @Override
    public void saveContractServiceInclude(CT_ServiceInclude serviceInclude) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CONTRACT_INCLUDE_SERVICE);
        preparedStatement.setInt(1, serviceInclude.getId());
        preparedStatement.setString(2, serviceInclude.getName());
        preparedStatement.setInt(3, serviceInclude.getUnit());
        preparedStatement.setInt(4, serviceInclude.getPrice());
        preparedStatement.setString(5, serviceInclude.getStatus());
        preparedStatement.executeUpdate();
    }

    @Override
    public CT_ServiceInclude getContractServiceIncludeById(int id) throws SQLException {
        CT_ServiceInclude serviceInclude = null;
        PreparedStatement preparedStatement = connection.prepareStatement(GET_CONTRACT_INCLUDE_SERVICE_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            int unit = resultSet.getInt("unit");
            int price = resultSet.getInt("price");
            String status = resultSet.getString("status");
            serviceInclude = new CT_ServiceInclude(id, name, unit, price, status);
        }
        return serviceInclude;
    }

    @Override
    public List<CT_ServiceInclude> getAllContractServiceInclude() throws SQLException {
        List<CT_ServiceInclude> serviceIncludeList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_CONTRACT_INCLUDE_SERVICE);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int unit = resultSet.getInt("unit");
            int price = resultSet.getInt("price");
            String status = resultSet.getString("status");
            serviceIncludeList.add(new CT_ServiceInclude(id, name, unit, price, status));
        }
        return serviceIncludeList;
    }

    @Override
    public boolean deleteContractServiceInclude(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CONTRACT_INCLUDE_SERVICE);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateContractServiceInclude(CT_ServiceInclude serviceInclude) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CONTRACT_INCLUDE_SERVICE);
        preparedStatement.setString(1, serviceInclude.getName());
        preparedStatement.setInt(2, serviceInclude.getUnit());
        preparedStatement.setInt(3, serviceInclude.getPrice());
        preparedStatement.setString(4, serviceInclude.getStatus());
        preparedStatement.setInt(5, serviceInclude.getId());
        return preparedStatement.executeUpdate() > 0;
    }
}
