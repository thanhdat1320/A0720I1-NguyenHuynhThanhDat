package service;

import model.SV_Service;
import model.SV_TypeRent;

import java.sql.SQLException;
import java.util.List;

public interface IServiceTypeRent {
    void saveTypeRentService(SV_TypeRent typeRent) throws SQLException;

    SV_TypeRent getTypeRentServiceById(int id) throws SQLException;

    List<SV_TypeRent> getAllTypeRentService() throws SQLException;

    boolean deleteTypeRentService(int id) throws SQLException;

    boolean updateTypeRentService(SV_TypeRent typeRent, int id) throws SQLException;
}
