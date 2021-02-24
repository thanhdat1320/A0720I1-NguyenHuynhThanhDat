package service.impl;

import dao.IContractIncludeServiceDAO;
import dao.impl.ContractIncludeServiceDAOImpl;
import model.CT_ServiceInclude;
import service.IContractIncludeService;

import java.sql.SQLException;
import java.util.List;

public class ContractIncludeServiceImpl implements IContractIncludeService {
    private IContractIncludeServiceDAO contractIncludeServiceDAO = new ContractIncludeServiceDAOImpl();
    @Override
    public void saveContractServiceInclude(CT_ServiceInclude serviceInclude) throws SQLException {
        this.contractIncludeServiceDAO.saveContractServiceInclude(serviceInclude);
    }

    @Override
    public CT_ServiceInclude getContractServiceIncludeById(int id) throws SQLException {
        return this.contractIncludeServiceDAO.getContractServiceIncludeById(id);
    }

    @Override
    public List<CT_ServiceInclude> getAllContractServiceInclude() throws SQLException {
        return this.contractIncludeServiceDAO.getAllContractServiceInclude();
    }

    @Override
    public boolean deleteContractServiceInclude(int id) throws SQLException {
        return this.contractIncludeServiceDAO.deleteContractServiceInclude(id);
    }

    @Override
    public boolean updateContractServiceInclude(CT_ServiceInclude serviceInclude, int id) throws SQLException {
        return this.contractIncludeServiceDAO.updateContractServiceInclude(serviceInclude);
    }
}
