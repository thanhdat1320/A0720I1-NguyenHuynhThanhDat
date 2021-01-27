package service.impl;

import dao.IEmployeePositionDAO;
import dao.impl.EmployeePositionDAOImpl;
import model.EP_PositionEmployee;
import service.IEmployeePositionService;

import java.sql.SQLException;
import java.util.List;

public class EmployeePositionServiceImpl implements IEmployeePositionService {
    private IEmployeePositionDAO employeePositionDAO = new EmployeePositionDAOImpl();

    @Override
    public void savePositionEmployee(EP_PositionEmployee positionEmployee) throws SQLException {
        this.employeePositionDAO.savePositionEmployee(positionEmployee);
    }

    @Override
    public EP_PositionEmployee getPositionEmployeeById(int id) throws SQLException {
        return this.employeePositionDAO.getPositionEmployeeById(id);
    }

    @Override
    public List<EP_PositionEmployee> getAllPositionEmployee() throws SQLException {
        return this.employeePositionDAO.getAllPositionEmployee();
    }

    @Override
    public boolean deletePositionEmployee(int id) throws SQLException {
        return this.employeePositionDAO.deletePositionEmployee(id);
    }

    @Override
    public boolean updatePositionEmployee(EP_PositionEmployee positionEmployee, int id) throws SQLException {
        return this.employeePositionDAO.updatePositionEmployee(positionEmployee);
    }
}
