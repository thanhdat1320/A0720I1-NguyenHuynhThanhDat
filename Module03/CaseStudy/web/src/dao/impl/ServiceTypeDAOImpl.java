package dao.impl;

import dao.IServiceTypeDAO;
import model.SV_TypeRent;
import model.SV_TypeService;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceTypeDAOImpl  implements IServiceTypeDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT_TYPE_SERVICE = "insert into sv_type_services(id, name) value(?, ?)";
    public static final String GET_TYPE_SERVICE_BY_ID = "select * from sv_type_services where id = ?";
    public static final String GET_ALL_TYPE_SERVICE = "select * from sv_type_services";
    public static final String DELETE_TYPE_SERVICE = "delete from sv_type_services where id = ?";
    public static final String UPDATE_TYPE_SERVICE = "update sv_type_services set name = ?  where id = ?";

    @Override
    public void saveTypeService(SV_TypeService typeService) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TYPE_SERVICE);
        preparedStatement.setInt(1, typeService.getId());
        preparedStatement.setString(2, typeService.getName());
        preparedStatement.executeUpdate();
    }

    @Override
    public SV_TypeService getTypeServiceById(int id) throws SQLException {
        SV_TypeService typeService = null;
        PreparedStatement preparedStatement = connection.prepareStatement(GET_TYPE_SERVICE_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            typeService = new SV_TypeService(id, name);
        }
        return typeService;
    }

    @Override
    public List<SV_TypeService> getAllTypeService() throws SQLException {
        List<SV_TypeService> typeServices = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_TYPE_SERVICE);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            typeServices.add(new SV_TypeService(id, name));
        }
        return typeServices;
    }

    @Override
    public boolean deleteTypeService(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_TYPE_SERVICE);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateTypeService(SV_TypeService typeService) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_TYPE_SERVICE);
        preparedStatement.setString(1, typeService.getName());
        preparedStatement.setInt(2, typeService.getId());
        return preparedStatement.executeUpdate() > 0;
    }
}
