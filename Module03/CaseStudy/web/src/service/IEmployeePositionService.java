package service;

import model.EP_Employee;
import model.EP_PositionEmployee;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeePositionService {
    void savePositionEmployee(EP_PositionEmployee positionEmployee) throws SQLException;

    EP_PositionEmployee getPositionEmployeeById(int id) throws SQLException;

    List<EP_PositionEmployee> getAllPositionEmployee() throws SQLException;

    boolean deletePositionEmployee(int id) throws SQLException;

    boolean updatePositionEmployee(EP_PositionEmployee positionEmployee, int id) throws SQLException;
}
