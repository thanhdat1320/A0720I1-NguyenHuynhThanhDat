package dao.impl;

import dao.IEmployeePositionDAO;
import model.EP_DepartmentEmployee;
import model.EP_PositionEmployee;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeePositionDAOImpl implements IEmployeePositionDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT_POSITION_EMPLOYEE = "insert into ep_position_employee(id, name) value(?, ?)";
    public static final String GET_POSITION_EMPLOYEE_BY_ID = "select * from ep_position_employee where id = ?";
    public static final String GET_ALL_POSITION_EMPLOYEE = "select * from ep_position_employee";
    public static final String DELETE_POSITION_EMPLOYEE = "delete from ep_position_employee where id = ?";
    public static final String UPDATE_POSITION_EMPLOYEE = "update ep_position_employee set name = ? where id = ?";


    @Override
    public void savePositionEmployee(EP_PositionEmployee positionEmployee) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_POSITION_EMPLOYEE);
        preparedStatement.setInt(1, positionEmployee.getId());
        preparedStatement.setString(2, positionEmployee.getName());
        preparedStatement.executeUpdate();
    }

    @Override
    public EP_PositionEmployee getPositionEmployeeById(int id) throws SQLException {
        EP_PositionEmployee positionEmployee = null;
        PreparedStatement preparedStatement = connection.prepareStatement(GET_POSITION_EMPLOYEE_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            positionEmployee = new EP_PositionEmployee(id, name);
        }
        return positionEmployee;
    }

    @Override
    public List<EP_PositionEmployee> getAllPositionEmployee() throws SQLException {
        List<EP_PositionEmployee> positionEmployeeList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_POSITION_EMPLOYEE);

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            positionEmployeeList.add(new EP_PositionEmployee(id, name));
        }
        return positionEmployeeList;
    }

    @Override
    public boolean deletePositionEmployee(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_POSITION_EMPLOYEE);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updatePositionEmployee(EP_PositionEmployee positionEmployee) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_POSITION_EMPLOYEE);
        preparedStatement.setString(1, positionEmployee.getName());
        preparedStatement.setInt(2, positionEmployee.getId());
        return preparedStatement.executeUpdate() > 0;
    }
}
