package dao.impl;

import dao.ICostDAO;
import model.Cost;
import model.House;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CostDAOImpl implements ICostDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT_COST = "insert into cost(id, name) value(?, ?)";
    public static final String GET_COST_BY_ID = "select * from cost where id = ?";
    public static final String GET_ALL_COST = "select * from cost";
    public static final String DELETE_COST = "delete from cost where id = ?";
    public static final String UPDATE_COST = "update cost set name = ? where id = ?";



    @Override
    public void saveCost(Cost cost) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_COST);
        preparedStatement.setString(1, cost.getId());
        preparedStatement.setString(2, cost.getName());
        preparedStatement.executeUpdate();
    }

    @Override
    public Cost getCostById(String id) throws SQLException {
        Cost cost = null;
        PreparedStatement preparedStatement = connection.prepareStatement(GET_COST_BY_ID);
        preparedStatement.setString(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            cost = new Cost(id, name);
        }
        return cost;
    }

    @Override
    public List<Cost> getAllCost() throws SQLException {
        List<Cost> costList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_COST);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            costList.add( new Cost(id, name));
        }
        return costList;
    }

    @Override
    public boolean deleteCost(String id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_COST);
        preparedStatement.setString(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateCost(Cost cost) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_COST);
        preparedStatement.setString(1, cost.getName());
        preparedStatement.setString(2, cost.getId());
        return preparedStatement.executeUpdate() > 0;
    }
}
