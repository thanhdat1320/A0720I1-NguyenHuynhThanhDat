package dao;

import model.EP_DepartmentEmployee;
import model.EP_Employee;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeDepartmentDAO {
    void saveDepartmentEmployee(EP_DepartmentEmployee departmentEmployee) throws SQLException;

    EP_DepartmentEmployee getDepartmentEmployeeById(int id) throws SQLException;

    List<EP_DepartmentEmployee> getAllDepartmentEmployee() throws SQLException;

    boolean deleteDepartmentEmployee(int id) throws SQLException;

    boolean updateDepartmentEmployee(EP_DepartmentEmployee departmentEmployee) throws SQLException;
}
