package dao;

import model.CT_ContractDetail;
import model.CT_ServiceInclude;

import java.sql.SQLException;
import java.util.List;

public interface IContractIncludeServiceDAO {
    void saveContractServiceInclude(CT_ServiceInclude serviceInclude) throws SQLException;

    CT_ServiceInclude getContractServiceIncludeById(int id) throws SQLException;

    List<CT_ServiceInclude> getAllContractServiceInclude() throws SQLException;

    boolean deleteContractServiceInclude(int id) throws SQLException;

    boolean updateContractServiceInclude(CT_ServiceInclude serviceInclude) throws SQLException;
}
