package service.impl;

import dao.IServiceTypeRentDAO;
import dao.impl.ServiceTypeRentDAOImpl;
import model.SV_TypeRent;
import service.IServiceTypeRent;

import java.sql.SQLException;
import java.util.List;

public class ServiceTypeRent implements IServiceTypeRent {
    private IServiceTypeRentDAO serviceTypeRentDAO = new ServiceTypeRentDAOImpl();

    @Override
    public void saveTypeRentService(SV_TypeRent typeRent) throws SQLException {
        this.serviceTypeRentDAO.saveTypeRentService(typeRent);
    }

    @Override
    public SV_TypeRent getTypeRentServiceById(int id) throws SQLException {
        return this.serviceTypeRentDAO.getTypeRentServiceById(id);
    }

    @Override
    public List<SV_TypeRent> getAllTypeRentService() throws SQLException {
        return this.serviceTypeRentDAO.getAllTypeRentService();
    }

    @Override
    public boolean deleteTypeRentService(int id) throws SQLException {
        return this.serviceTypeRentDAO.deleteTypeRentService(id);
    }

    @Override
    public boolean updateTypeRentService(SV_TypeRent typeRent, int id) throws SQLException {
        return this.serviceTypeRentDAO.updateTypeRentService(typeRent);
    }
}
