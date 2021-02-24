package service;

import model.CT_Contract;
import model.dto.ContractDTO;


import java.sql.SQLException;
import java.util.List;

public interface IContractService {
    void saveContract(CT_Contract contract) throws SQLException;

    CT_Contract getContractById(int id) throws SQLException;

    List<CT_Contract> getAllContract() throws SQLException;

    boolean deleteContract(int id) throws SQLException;

    boolean updateContract(CT_Contract contract, int id) throws SQLException;

    List<ContractDTO> getAllContractDTO() throws SQLException;
}
