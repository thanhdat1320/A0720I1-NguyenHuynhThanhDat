package dao;

import model.EP_Employee;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeLevelDAO {
    void saveEmployee(EP_Employee employee) throws SQLException;

    EP_Employee getEmployeeById(int id) throws SQLException;

    List<EP_Employee> getAllEmployee() throws SQLException;

    boolean deleteEmployee(int id) throws SQLException;

    boolean updateEmployee(EP_Employee employee) throws SQLException;
}
