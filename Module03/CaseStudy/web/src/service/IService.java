package service;

import model.CS_Customer;
import model.SV_Service;
import model.dto.ServiceDTO;

import java.sql.SQLException;
import java.util.List;

public interface IService {
    void saveService(SV_Service service) throws SQLException;

    SV_Service getServiceById(int id) throws SQLException;

    List<SV_Service> getAllService() throws SQLException;

    boolean deleteService(int id) throws SQLException;

    boolean updateService(SV_Service service, int id) throws SQLException;

    List<ServiceDTO> getAllServiceDTO() throws SQLException;
}
