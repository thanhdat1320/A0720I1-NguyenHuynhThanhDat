package dao.impl;

import dao.IEmployeeLevelDAO;
import model.EP_LevelEmployee;
import model.EP_PositionEmployee;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeLevelDAOImpl implements IEmployeeLevelDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT_LEVEL_EMPLOYEE = "insert into ep_level_employee(id, name) value(?, ?)";
    public static final String GET_LEVEL_EMPLOYEE_BY_ID = "select * from ep_level_employee where id = ?";
    public static final String GET_ALL_LEVEL_EMPLOYEE = "select * from ep_level_employee";
    public static final String DELETE_LEVEL_EMPLOYEE = "delete from ep_level_employee where id = ?";
    public static final String UPDATE_LEVEL_EMPLOYEE = "update ep_level_employee set name = ? where id = ?";


    @Override
    public void saveLevelEmployee(EP_LevelEmployee levelEmployee) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_LEVEL_EMPLOYEE);
        preparedStatement.setInt(1, levelEmployee.getId());
        preparedStatement.setString(2, levelEmployee.getName());
        preparedStatement.executeUpdate();
    }

    @Override
    public EP_LevelEmployee getLevelEmployeeById(int id) throws SQLException {
        EP_LevelEmployee levelEmployee = null;
        PreparedStatement preparedStatement = connection.prepareStatement(GET_LEVEL_EMPLOYEE_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            levelEmployee = new EP_LevelEmployee(id, name);
        }
        return levelEmployee;
    }

    @Override
    public List<EP_LevelEmployee> getAllLevelEmployee() throws SQLException {
        List<EP_LevelEmployee> levelEmployeeList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_LEVEL_EMPLOYEE);

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            levelEmployeeList.add(new EP_LevelEmployee(id, name));
        }
        return levelEmployeeList;
    }

    @Override
    public boolean deleteLevelEmployee(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_LEVEL_EMPLOYEE);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateLevelEmployee(EP_LevelEmployee levelEmployee) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_LEVEL_EMPLOYEE);
        preparedStatement.setString(1, levelEmployee.getName());
        preparedStatement.setInt(2, levelEmployee.getId());
        return preparedStatement.executeUpdate() > 0;
    }
}
