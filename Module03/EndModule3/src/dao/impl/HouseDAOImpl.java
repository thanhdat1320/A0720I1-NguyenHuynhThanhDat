package dao.impl;

import dao.IHouseDAO;
import model.House;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HouseDAOImpl implements IHouseDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT_HOUSE = "insert into house(id, name, phone, start, note, id_cost) value(?, ?, ?, ?, ?, ?)";
    public static final String GET_HOUSE_BY_ID = "select * from house where id = ?";
    public static final String GET_ALL_HOUSE = "select * from house";
    public static final String DELETE_HOUSE = "delete from house where id = ?";
    public static final String UPDATE_HOUSE = "update house set name = ?, phone = ?, start = ?, note = ?, id_cost = ? where id = ?";


    @Override
    public void saveHouse(House house) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_HOUSE);
        preparedStatement.setString(1, house.getId());
        preparedStatement.setString(2, house.getName());
        preparedStatement.setString(3, house.getPhone());
        preparedStatement.setString(4, house.getStart());
        preparedStatement.setString(5, house.getNote());
        preparedStatement.setString(6, house.getIdCost());
        preparedStatement.executeUpdate();
    }

    @Override
    public House getHouseById(String id) throws SQLException {
        House house = null;
        PreparedStatement preparedStatement = connection.prepareStatement(GET_HOUSE_BY_ID);
        preparedStatement.setString(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            String phone = resultSet.getString("phone");
            String start = resultSet.getString("start");
            String note = resultSet.getString("note");
            String id_cost = resultSet.getString("id_cost");
            house = new House(id, name, phone, start, note, id_cost );
        }
        return house;
    }

    @Override
    public List<House> getAllHouse() throws SQLException {
        List<House> houseList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_HOUSE);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            String phone = resultSet.getString("phone");
            String start = resultSet.getString("start");
            String note = resultSet.getString("note");
            String id_cost = resultSet.getString("id_cost");
            houseList.add( new House(id, name, phone, start, note, id_cost ));
        }
        return houseList;
    }

    @Override
    public boolean deleteHouse(String id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_HOUSE);
        preparedStatement.setString(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateHouse(House house) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_HOUSE);
        preparedStatement.setString(1, house.getName());
        preparedStatement.setString(2, house.getPhone());
        preparedStatement.setString(3, house.getStart());
        preparedStatement.setString(4, house.getNote());
        preparedStatement.setString(5, house.getIdCost());
        preparedStatement.setString(6, house.getId());
        return preparedStatement.executeUpdate() > 0;
    }
}
