package dao;

import model.SV_Service;
import model.SV_TypeService;

import java.sql.SQLException;
import java.util.List;

public interface IServiceTypeDAO {
    void saveTypeService(SV_TypeService typeService) throws SQLException;

    SV_TypeService getTypeServiceById(int id) throws SQLException;

    List<SV_TypeService> getAllTypeService() throws SQLException;

    boolean deleteTypeService(int id) throws SQLException;

    boolean updateTypeService(SV_TypeService typeService) throws SQLException;
}
