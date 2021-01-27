package service.impl;

import dao.IServiceDAO;
import dao.impl.ServiceDAOImpl;
import model.SV_Service;
import model.SV_TypeRent;
import model.SV_TypeService;
import model.dto.ServiceDTO;
import service.IService;
import service.IServiceType;
import service.IServiceTypeRent;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements IService {
    private IServiceDAO serviceDAO = new ServiceDAOImpl();
    private IServiceType serviceType = new ServiceTypeImpl();
    private IServiceTypeRent serviceTypeRent = new ServiceTypeRent();

    @Override
    public void saveService(SV_Service service) throws SQLException {
        this.serviceDAO.saveService(service);
    }

    @Override
    public SV_Service getServiceById(int id) throws SQLException {
        return this.serviceDAO.getServiceById(id);
    }

    @Override
    public List<SV_Service> getAllService() throws SQLException {
        return this.serviceDAO.getAllService();
    }

    @Override
    public boolean deleteService(int id) throws SQLException {
        return this.serviceDAO.deleteService(id);
    }

    @Override
    public boolean updateService(SV_Service service, int id) throws SQLException {
        return this.serviceDAO.updateService(service);
    }

    @Override
    public List<ServiceDTO> getAllServiceDTO() throws SQLException {
        List<ServiceDTO> serviceDTOList = new ArrayList<>();
        List<SV_Service> serviceList = this.serviceDAO.getAllService();

        for (SV_Service service : serviceList) {
            ServiceDTO serviceDTO = new ServiceDTO();
            serviceDTO.setId(service.getId());
            serviceDTO.setName(service.getName());
            serviceDTO.setStatus(service.getStatus());

            SV_TypeService typeService = this.serviceType.getTypeServiceById(service.getIdTypeServices());
            serviceDTO.setIdTypeService(typeService.getId());
            serviceDTO.setNameTypeService(typeService.getName());

            SV_TypeRent typeRent = this.serviceTypeRent.getTypeRentServiceById(service.getIdTypeRents());
            serviceDTO.setIdTypeRent(typeRent.getId());
            serviceDTO.setNameTypeRent(typeRent.getName());

            serviceDTOList.add(serviceDTO);
        }
        return serviceDTOList;
    }
}
