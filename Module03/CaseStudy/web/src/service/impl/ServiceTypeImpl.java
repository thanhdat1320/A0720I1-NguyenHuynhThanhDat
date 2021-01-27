package service.impl;

import dao.IServiceTypeDAO;
import dao.impl.ServiceTypeDAOImpl;
import model.SV_TypeService;
import service.IServiceType;

import java.sql.SQLException;
import java.util.List;

public class ServiceTypeImpl implements IServiceType {
    private IServiceTypeDAO serviceTypeDAO = new ServiceTypeDAOImpl();

    @Override
    public void saveTypeService(SV_TypeService typeService) throws SQLException {
        this.serviceTypeDAO.saveTypeService(typeService);
    }

    @Override
    public SV_TypeService getTypeServiceById(int id) throws SQLException {
        return this.serviceTypeDAO.getTypeServiceById(id);
    }

    @Override
    public List<SV_TypeService> getAllTypeService() throws SQLException {
        return this.serviceTypeDAO.getAllTypeService();
    }

    @Override
    public boolean deleteTypeService(int id) throws SQLException {
        return this.serviceTypeDAO.deleteTypeService(id);
    }

    @Override
    public boolean updateTypeService(SV_TypeService typeService, int id) throws SQLException {
        return this.serviceTypeDAO.updateTypeService(typeService);
    }

}
