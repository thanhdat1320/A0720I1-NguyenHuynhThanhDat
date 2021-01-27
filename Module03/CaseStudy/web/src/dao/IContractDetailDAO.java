package dao;

import model.CT_Contract;
import model.CT_ContractDetail;

import java.sql.SQLException;
import java.util.List;

public interface IContractDetailDAO {
    void saveContractDetail(CT_ContractDetail contractDetail) throws SQLException;

    CT_ContractDetail getContractDetailById(int id) throws SQLException;

    List<CT_ContractDetail> getAllContractDetail() throws SQLException;

    boolean deleteContractDetail(int id) throws SQLException;

    boolean updateContractDetail(CT_ContractDetail contractDetail) throws SQLException;
}
