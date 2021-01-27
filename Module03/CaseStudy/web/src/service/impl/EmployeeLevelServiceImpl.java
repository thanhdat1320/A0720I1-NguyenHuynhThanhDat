package service.impl;

import dao.IEmployeeLevelDAO;
import dao.impl.EmployeeLevelDAOImpl;
import model.EP_LevelEmployee;
import service.IEmployeeLevelService;

import java.sql.SQLException;
import java.util.List;

public class EmployeeLevelServiceImpl implements IEmployeeLevelService {
    private IEmployeeLevelDAO employeeLevelDAO = new EmployeeLevelDAOImpl();

    @Override
    public void saveLevelEmployee(EP_LevelEmployee levelEmployee) throws SQLException {
        this.employeeLevelDAO.saveLevelEmployee(levelEmployee);
    }

    @Override
    public EP_LevelEmployee getLevelEmployeeById(int id) throws SQLException {
        return this.employeeLevelDAO.getLevelEmployeeById(id);
    }

    @Override
    public List<EP_LevelEmployee> getAllLevelEmployee() throws SQLException {
        return this.employeeLevelDAO.getAllLevelEmployee();
    }

    @Override
    public boolean deleteLevelEmployee(int id) throws SQLException {
        return this.employeeLevelDAO.deleteLevelEmployee(id);
    }

    @Override
    public boolean updateLevelEmployee(EP_LevelEmployee levelEmployee, int id) throws SQLException {
        return this.employeeLevelDAO.updateLevelEmployee(levelEmployee);
    }
}
