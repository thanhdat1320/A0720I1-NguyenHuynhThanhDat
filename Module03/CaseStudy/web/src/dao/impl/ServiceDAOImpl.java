package dao.impl;

import dao.IServiceDAO;
import model.CS_Customer;
import model.SV_Service;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceDAOImpl implements IServiceDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT_SERVICE = "insert into sv_services(id, name, area, floor, amounts, price, status, id_type_rents, id_type_services) value(?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String GET_SERVICE_BY_ID = "select * from sv_services where id = ?";
    public static final String GET_ALL_SERVICE = "select * from sv_services";
    public static final String DELETE_SERVICE = "delete from sv_services where id = ?";
    public static final String UPDATE_SERVICE = "update sv_services set name = ?, area = ?, floor = ?, amounts = ?, price = ?, status = ?, id_type_rents = ?, id_type_services = ?  where id = ?";

    @Override
    public void saveService(SV_Service service) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SERVICE);
        preparedStatement.setInt(1, service.getId());
        preparedStatement.setString(2, service.getName());
        preparedStatement.setInt(3, service.getArea());
        preparedStatement.setInt(4, service.getFloor());
        preparedStatement.setString(5, service.getAmount());
        preparedStatement.setString(6, service.getPrice());
        preparedStatement.setString(7, service.getStatus());
        preparedStatement.setInt(8, service.getIdTypeRents());
        preparedStatement.setInt(9, service.getIdTypeServices());
        preparedStatement.executeUpdate();
    }

    @Override
    public SV_Service getServiceById(int id) throws SQLException {
        SV_Service service = null;
        PreparedStatement preparedStatement = connection.prepareStatement(GET_SERVICE_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            int area = resultSet.getInt("area");
            int floor = resultSet.getInt("floor");
            String amounts = resultSet.getString("amounts");
            String price = resultSet.getString("price");
            String status = resultSet.getString("status");
            int id_type_rents = resultSet.getInt("id_type_rents");
            int id_type_services = resultSet.getInt("id_type_services");
            service = new SV_Service(id, id_type_rents, id_type_services, name, area, floor, amounts, price, status);
        }
        return service;
    }

    @Override
    public List<SV_Service> getAllService() throws SQLException {
        List<SV_Service> serviceList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_SERVICE);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int area = resultSet.getInt("area");
            int floor = resultSet.getInt("floor");
            String amounts = resultSet.getString("amounts");
            String price = resultSet.getString("price");
            String status = resultSet.getString("status");
            int id_type_rents = resultSet.getInt("id_type_rents");
            int id_type_services = resultSet.getInt("id_type_services");
            serviceList.add(new SV_Service(id, id_type_rents, id_type_services, name, area, floor, amounts, price, status));
        }
        return serviceList;
    }

    @Override
    public boolean deleteService(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_SERVICE);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateService(SV_Service service) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_SERVICE);
        preparedStatement.setString(1, service.getName());
        preparedStatement.setInt(2, service.getArea());
        preparedStatement.setInt(3, service.getFloor());
        preparedStatement.setString(4, service.getAmount());
        preparedStatement.setString(5, service.getPrice());
        preparedStatement.setString(6, service.getStatus());
        preparedStatement.setInt(7, service.getIdTypeRents());
        preparedStatement.setInt(8, service.getIdTypeServices());
        preparedStatement.setInt(9, service.getId());
        return preparedStatement.executeUpdate() > 0;
    }
}
