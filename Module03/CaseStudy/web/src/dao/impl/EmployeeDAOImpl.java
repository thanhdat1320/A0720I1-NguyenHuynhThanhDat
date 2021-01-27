package dao.impl;

import dao.IEmployeeDAO;
import model.EP_Employee;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements IEmployeeDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT_EMPLOYEE = "insert into ep_employee(id, name, birthday, identity, phone_number, email, salary, id_level_employee, id_position_employee, id_department_employee) value(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String GET_EMPLOYEE_BY_ID = "select * from ep_employee where id = ?";
    public static final String GET_ALL_EMPLOYEE = "select * from ep_employee";
    public static final String DELETE_EMPLOYEE = "delete from ep_employee where id = ?";
    public static final String UPDATE_EMPLOYEE = "update ep_employee set name = ?, birthday = ?, identity = ?, phone_number = ?, email = ?, salary = ?, id_level_employee = ?, id_position_employee = ?, id_department_employee = ? where id = ?";



    @Override
    public void saveEmployee(EP_Employee employee) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE);
        preparedStatement.setInt(1, employee.getId());
        preparedStatement.setString(2, employee.getName());
        preparedStatement.setString(3, employee.getBirthday());
        preparedStatement.setString(4, employee.getIdentity());
        preparedStatement.setString(5, employee.getPhoneNumber());
        preparedStatement.setString(6, employee.getEmail());
        preparedStatement.setString(7, employee.getSalary());
        preparedStatement.setInt(8, employee.getIdLevelEmployee());
        preparedStatement.setInt(9, employee.getIdPositionEmployee());
        preparedStatement.setInt(10, employee.getIdDepartmentEmployee());
        preparedStatement.executeUpdate();
    }

    @Override
    public EP_Employee getEmployeeById(int id) throws SQLException {
        EP_Employee employee = null;
        PreparedStatement preparedStatement = connection.prepareStatement(GET_EMPLOYEE_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            String birthday = resultSet.getString("birthday");
            String identity = resultSet.getString("identity");
            String phone_number = resultSet.getString("phone_number");
            String email = resultSet.getString("email");
            String salary = resultSet.getString("salary");
            int id_level_employee = resultSet.getInt("id_level_employee");
            int id_position_employee = resultSet.getInt("id_position_employee");
            int id_department_employee = resultSet.getInt("id_department_employee");
            employee = new EP_Employee(id, id_level_employee, id_position_employee, id_department_employee, name, birthday, identity, phone_number, email, salary);
        }
        return employee;
    }

    @Override
    public List<EP_Employee> getAllEmployee() throws SQLException {
        List<EP_Employee> employeeList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_EMPLOYEE);

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String birthday = resultSet.getString("birthday");
            String identity = resultSet.getString("identity");
            String phone_number = resultSet.getString("phone_number");
            String email = resultSet.getString("email");
            String salary = resultSet.getString("salary");
            int id_level_employee = resultSet.getInt("id_level_employee");
            int id_position_employee = resultSet.getInt("id_position_employee");
            int id_department_employee = resultSet.getInt("id_department_employee");
            employeeList.add(new EP_Employee(id, id_level_employee, id_position_employee, id_department_employee, name, birthday, identity, phone_number, email, salary));
        }
        return employeeList;
    }

    @Override
    public boolean deleteEmployee(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateEmployee(EP_Employee employee) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getBirthday());
        preparedStatement.setString(3, employee.getIdentity());
        preparedStatement.setString(4, employee.getPhoneNumber());
        preparedStatement.setString(5, employee.getEmail());
        preparedStatement.setString(6, employee.getSalary());
        preparedStatement.setInt(7, employee.getIdLevelEmployee());
        preparedStatement.setInt(8, employee.getIdPositionEmployee());
        preparedStatement.setInt(9, employee.getIdDepartmentEmployee());
        preparedStatement.setInt(10, employee.getId());
        return preparedStatement.executeUpdate() > 0;
    }
}
