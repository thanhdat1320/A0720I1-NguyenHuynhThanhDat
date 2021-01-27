package dao.impl;

import dao.IServiceTypeRentDAO;
import model.SV_Service;
import model.SV_TypeRent;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceTypeRentDAOImpl implements IServiceTypeRentDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT_TYPE_RENT_SERVICE = "insert into sv_type_rents(id, name, price) value(?, ?, ?)";
    public static final String GET_TYPE_RENT_SERVICE_BY_ID = "select * from sv_type_rents where id = ?";
    public static final String GET_ALL_TYPE_RENT_SERVICE = "select * from sv_type_rents";
    public static final String DELETE_TYPE_RENT_SERVICE = "delete from sv_type_rents where id = ?";
    public static final String UPDATE_TYPE_RENT_SERVICE = "update sv_type_rents set name = ?, price = ?  where id = ?";

    @Override
    public void saveTypeRentService(SV_TypeRent typeRent) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TYPE_RENT_SERVICE);
        preparedStatement.setInt(1, typeRent.getId());
        preparedStatement.setString(2, typeRent.getName());
        preparedStatement.setInt(3, typeRent.getPrice());
        preparedStatement.executeUpdate();
    }

    @Override
    public SV_TypeRent getTypeRentServiceById(int id) throws SQLException {
        SV_TypeRent typeRent = null;
        PreparedStatement preparedStatement = connection.prepareStatement(GET_TYPE_RENT_SERVICE_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            int price = resultSet.getInt("price");

            typeRent = new SV_TypeRent(id, name, price);
        }
        return typeRent;
    }

    @Override
    public List<SV_TypeRent> getAllTypeRentService() throws SQLException {
        List<SV_TypeRent> typeRentList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_TYPE_RENT_SERVICE);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int price = resultSet.getInt("price");
            typeRentList.add(new SV_TypeRent(id, name, price));
        }
        return typeRentList;
    }

    @Override
    public boolean deleteTypeRentService(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_TYPE_RENT_SERVICE);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateTypeRentService(SV_TypeRent typeRent) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_TYPE_RENT_SERVICE);
        preparedStatement.setString(1, typeRent.getName());
        preparedStatement.setInt(2, typeRent.getPrice());
        preparedStatement.setInt(3, typeRent.getId());
        return preparedStatement.executeUpdate() > 0;
    }
}
