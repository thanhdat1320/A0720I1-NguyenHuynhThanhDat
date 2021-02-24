package service.impl;

import dao.IContractDetailDAO;
import dao.impl.ContractDetailDAOImpl;
import model.CT_ContractDetail;
import service.IContractDetailService;

import java.sql.SQLException;
import java.util.List;

public class ContractDetailImpl implements IContractDetailService{
    private IContractDetailDAO contractDetailDAO = new ContractDetailDAOImpl();

    @Override
    public void saveContractDetail(CT_ContractDetail contractDetail) throws SQLException {
        this.contractDetailDAO.saveContractDetail(contractDetail);
    }

    @Override
    public CT_ContractDetail getContractDetailById(int id) throws SQLException {
        return this.contractDetailDAO.getContractDetailById(id);
    }

    @Override
    public List<CT_ContractDetail> getAllContractDetail() throws SQLException {
        return this.contractDetailDAO.getAllContractDetail();
    }

    @Override
    public boolean deleteContractDetail(int id) throws SQLException {
        return this.contractDetailDAO.deleteContractDetail(id);
    }

    @Override
    public boolean updateContractDetail(CT_ContractDetail contractDetail, int id) throws SQLException {
        return this.contractDetailDAO.updateContractDetail(contractDetail);
    }
}
