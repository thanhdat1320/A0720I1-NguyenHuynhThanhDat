package dao;

import model.EP_Employee;
import model.SV_Service;

import java.sql.SQLException;
import java.util.List;

public interface IServiceDAO {
    void saveService(SV_Service service) throws SQLException;

    SV_Service getServiceById(int id) throws SQLException;

    List<SV_Service> getAllService() throws SQLException;

    boolean deleteService(int id) throws SQLException;

    boolean updateService(SV_Service service) throws SQLException;
}
