package dao;

import model.CS_Customer;
import model.EP_Employee;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeDAO {
    void saveEmployee(EP_Employee employee) throws SQLException;

    EP_Employee getEmployeeById(int id) throws SQLException;

    List<EP_Employee> getAllEmployee() throws SQLException;

    boolean deleteEmployee(int id) throws SQLException;

    boolean updateEmployee(EP_Employee employee) throws SQLException;
}
