package dao.impl;

import dao.IEmployeeDepartmentDAO;
import model.EP_DepartmentEmployee;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDepartmentDAOImpl implements IEmployeeDepartmentDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT_DEPARTMENT_EMPLOYEE = "insert into ep_department_employee(id, name) value(?, ?)";
    public static final String GET_DEPARTMENT_EMPLOYEE_BY_ID = "select * from ep_department_employee where id = ?";
    public static final String GET_ALL_DEPARTMENT_EMPLOYEE = "select * from ep_department_employee";
    public static final String DELETE_DEPARTMENT_EMPLOYEE = "delete from ep_department_employee where id = ?";
    public static final String UPDATE_DEPARTMENT_EMPLOYEE = "update ep_department_employee set name = ? where id = ?";


    @Override
    public void saveDepartmentEmployee(EP_DepartmentEmployee departmentEmployee) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DEPARTMENT_EMPLOYEE);
        preparedStatement.setInt(1, departmentEmployee.getId());
        preparedStatement.setString(2, departmentEmployee.getName());
        preparedStatement.executeUpdate();
    }

    @Override
    public EP_DepartmentEmployee getDepartmentEmployeeById(int id) throws SQLException {
        EP_DepartmentEmployee departmentEmployee = null;
        PreparedStatement preparedStatement = connection.prepareStatement(GET_DEPARTMENT_EMPLOYEE_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String  name = resultSet.getString("name");
            departmentEmployee = new EP_DepartmentEmployee(id, name);
        }
        return departmentEmployee;
    }

    @Override
    public List<EP_DepartmentEmployee> getAllDepartmentEmployee() throws SQLException {
        List<EP_DepartmentEmployee> departmentEmployeeList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_DEPARTMENT_EMPLOYEE);

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            departmentEmployeeList.add(new EP_DepartmentEmployee(id, name));
        }
        return departmentEmployeeList;
    }

    @Override
    public boolean deleteDepartmentEmployee(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_DEPARTMENT_EMPLOYEE);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateDepartmentEmployee(EP_DepartmentEmployee departmentEmployee) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_DEPARTMENT_EMPLOYEE);
        preparedStatement.setString(1, departmentEmployee.getName());
        preparedStatement.setInt(2, departmentEmployee.getId());
        return preparedStatement.executeUpdate() > 0;
    }
}
