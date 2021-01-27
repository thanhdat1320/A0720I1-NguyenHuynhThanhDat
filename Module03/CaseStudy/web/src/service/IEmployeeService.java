package service;

import model.CS_Customer;
import model.EP_Employee;
import model.dto.CustomerDTO;
import model.dto.EmployeeDTO;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeService {
    void saveEmployee(EP_Employee employee) throws SQLException;

    EP_Employee getEmployeeById(int id) throws SQLException;

    List<EP_Employee> getAllEmployee() throws SQLException;

    boolean deleteEmployee(int id) throws SQLException;

    boolean updateEmployee(EP_Employee employee, int id) throws SQLException;

    List<EmployeeDTO> getAllEmployeeDTO() throws SQLException;

    List<EmployeeDTO> searchEmployeeDTO(String name) throws  SQLException;
}
