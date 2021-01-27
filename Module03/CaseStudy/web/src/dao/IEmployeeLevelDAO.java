package dao;

import model.EP_Employee;
import model.EP_LevelEmployee;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeLevelDAO {
    void saveLevelEmployee(EP_LevelEmployee levelEmployee) throws SQLException;

    EP_LevelEmployee getLevelEmployeeById(int id) throws SQLException;

    List<EP_LevelEmployee> getAllLevelEmployee() throws SQLException;

    boolean deleteLevelEmployee(int id) throws SQLException;

    boolean updateLevelEmployee(EP_LevelEmployee levelEmployee) throws SQLException;
}
