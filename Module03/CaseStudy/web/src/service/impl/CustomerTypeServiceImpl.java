package service.impl;

import dao.ICustomerTypeDAO;
import dao.impl.CustomerTypeDAOImpl;
import model.CS_TypeCustomer;
import service.ICustomerTypeService;

import java.sql.SQLException;
import java.util.List;

public class CustomerTypeServiceImpl implements ICustomerTypeService {
    private ICustomerTypeDAO typeCustomerDAO = new CustomerTypeDAOImpl();

    @Override
    public void saveTypeCustomer(CS_TypeCustomer typeCustomer) throws SQLException {
        this.typeCustomerDAO.saveTypeCustomer(typeCustomer);
    }

    @Override
    public CS_TypeCustomer getTypeCustomerById(int id) throws SQLException {
        return this.typeCustomerDAO.getTypeCustomerById(id);
    }

    @Override
    public List<CS_TypeCustomer> getAllTypeCustomer() throws SQLException {
        return this.typeCustomerDAO.getAllTypeCustomer();
    }

    @Override
    public boolean deleteTypeCustomer(int id) throws SQLException {
        return this.typeCustomerDAO.deleteTypeCustomer(id);
    }

    @Override
    public boolean updateTypeCustomer(CS_TypeCustomer typeCustomer, int id) throws SQLException {
        return this.typeCustomerDAO.updateTypeCustomer(typeCustomer);
    }
}
