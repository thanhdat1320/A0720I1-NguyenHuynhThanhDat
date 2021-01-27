package dao.impl;

import dao.IContractDetailDAO;
import model.CT_Contract;
import model.CT_ContractDetail;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractDetailDAOImpl implements IContractDetailDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT_CONTRACT_DETAIL = "insert into ct_contract_detail(id, amount, id_contract, id_services_include) value(?, ?, ?, ?)";
    public static final String GET_CONTRACT_DETAIL_BY_ID = "select * from ct_contract_detail where id = ?";
    public static final String GET_ALL_CONTRACT_DETAIL = "select * from ct_contract_detail";
    public static final String DELETE_CONTRACT_DETAIL = "delete from ct_contract_detail where id = ?";
    public static final String UPDATE_CONTRACT_DETAIL = "update ct_contract_detail set amount = ?, id_contract = ?, id_services_include = ? where id = ?";


    @Override
    public void saveContractDetail(CT_ContractDetail contractDetail) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CONTRACT_DETAIL);
        preparedStatement.setInt(1, contractDetail.getId());
        preparedStatement.setInt(2, contractDetail.getAmount());
        preparedStatement.setInt(3, contractDetail.getIdContract());
        preparedStatement.setInt(4, contractDetail.getIdServiceInclude());
        preparedStatement.executeUpdate();
    }

    @Override
    public CT_ContractDetail getContractDetailById(int id) throws SQLException {
        CT_ContractDetail contractDetail = null;
        PreparedStatement preparedStatement = connection.prepareStatement(GET_CONTRACT_DETAIL_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            int amount = resultSet.getInt("amount");
            int id_contract = resultSet.getInt("id_contract");
            int id_services_include = resultSet.getInt("id_services_include");
            contractDetail = new CT_ContractDetail(id, amount, id_contract, id_services_include);
        }
        return contractDetail;
    }

    @Override
    public List<CT_ContractDetail> getAllContractDetail() throws SQLException {
        List<CT_ContractDetail> contractDetailList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_CONTRACT_DETAIL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            int amount = resultSet.getInt("amount");
            int id_contract = resultSet.getInt("id_contract");
            int id_services_include = resultSet.getInt("id_services_include");
            contractDetailList.add( new CT_ContractDetail(id, amount, id_contract, id_services_include));
        }
        return contractDetailList;
    }

    @Override
    public boolean deleteContractDetail(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CONTRACT_DETAIL);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateContractDetail(CT_ContractDetail contractDetail) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CONTRACT_DETAIL);
        preparedStatement.setInt(1, contractDetail.getId());
        preparedStatement.setInt(2, contractDetail.getAmount());
        preparedStatement.setInt(3, contractDetail.getIdContract());
        preparedStatement.setInt(4, contractDetail.getIdServiceInclude());
        return preparedStatement.executeUpdate() > 0;
    }
}
