package service.impl;

import dao.IEmployeeDepartmentDAO;
import dao.impl.EmployeeDepartmentDAOImpl;
import model.EP_DepartmentEmployee;
import service.IEmployeeDepartmentService;

import java.sql.SQLException;
import java.util.List;

public class EmployeeDepartmentServiceImpl implements IEmployeeDepartmentService {
    private IEmployeeDepartmentDAO employeeDepartmentDAO = new EmployeeDepartmentDAOImpl();

    @Override
    public void saveDepartmentEmployee(EP_DepartmentEmployee departmentEmployee) throws SQLException {
        this.employeeDepartmentDAO.saveDepartmentEmployee(departmentEmployee);
    }

    @Override
    public EP_DepartmentEmployee getDepartmentEmployeeById(int id) throws SQLException {
        return this.employeeDepartmentDAO.getDepartmentEmployeeById(id);
    }

    @Override
    public List<EP_DepartmentEmployee> getAllDepartmentEmployee() throws SQLException {
        return this.employeeDepartmentDAO.getAllDepartmentEmployee();
    }

    @Override
    public boolean deleteDepartmentEmployee(int id) throws SQLException {
        return this.employeeDepartmentDAO.deleteDepartmentEmployee(id);
    }

    @Override
    public boolean updateDepartmentEmployee(EP_DepartmentEmployee departmentEmployee, int id) throws SQLException {
        return this.employeeDepartmentDAO.updateDepartmentEmployee(departmentEmployee);
    }
}
