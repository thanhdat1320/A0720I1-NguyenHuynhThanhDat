package dao.impl;

import dao.IContractDAO;
import model.CS_Customer;
import model.CT_Contract;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractDAOImpl implements IContractDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT_CONTRACT = "insert into ct_contract(id, start_date, end_date, deposit, total, id_services, id_customer, id_employee) value(?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String GET_CONTRACT_BY_ID = "select * from ct_contract where id = ?";
    public static final String GET_ALL_CONTRACT = "select * from ct_contract";
    public static final String DELETE_CONTRACT = "delete from ct_contract where id = ?";
    public static final String UPDATE_CONTRACT = "update ct_contract set start_date = ?, end_date = ?, deposit = ?, total = ?, id_services = ?, id_customer = ?, id_employee = ? where id = ?";


    @Override
    public void saveContract(CT_Contract contract) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CONTRACT);
        preparedStatement.setInt(1, contract.getId());
        preparedStatement.setString(2, contract.getStart());
        preparedStatement.setString(3, contract.getEnd());
        preparedStatement.setInt(4, contract.getDeposit());
        preparedStatement.setInt(5, contract.getTotal());
        preparedStatement.setInt(6, contract.getIdServices());
        preparedStatement.setInt(7, contract.getIdCustomer());
        preparedStatement.setInt(8, contract.getIdEmployee());
        preparedStatement.executeUpdate();
    }

    @Override
    public CT_Contract getContractById(int id) throws SQLException {
        CT_Contract contract = null;
        PreparedStatement preparedStatement = connection.prepareStatement(GET_CONTRACT_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String start_date = resultSet.getString("start_date");
            String end_date = resultSet.getString("end_date");
            int deposit = resultSet.getInt("deposit");
            int total = resultSet.getInt("total");
            int id_services = resultSet.getInt("id_services");
            int id_customer = resultSet.getInt("id_customer");
            int id_employee = resultSet.getInt("id_employee");
            contract = new CT_Contract(id, id_services, id_customer, id_employee, start_date, end_date, deposit, total);
        }
        return contract;
    }

    @Override
    public List<CT_Contract> getAllContract() throws SQLException {
        List<CT_Contract> contractList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_CONTRACT);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String start_date = resultSet.getString("start_date");
            String end_date = resultSet.getString("end_date");
            int deposit = resultSet.getInt("deposit");
            int total = resultSet.getInt("total");
            int id_services = resultSet.getInt("id_services");
            int id_customer = resultSet.getInt("id_customer");
            int id_employee = resultSet.getInt("id_employee");
            contractList.add(new CT_Contract(id, id_services, id_customer, id_employee, start_date, end_date, deposit, total));
        }
        return contractList;
    }

    @Override
    public boolean deleteContract(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CONTRACT);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateContract(CT_Contract contract) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CONTRACT);
        preparedStatement.setString(1, contract.getStart());
        preparedStatement.setString(2, contract.getEnd());
        preparedStatement.setInt(3, contract.getDeposit());
        preparedStatement.setInt(4, contract.getTotal());
        preparedStatement.setInt(5, contract.getIdServices());
        preparedStatement.setInt(6, contract.getIdCustomer());
        preparedStatement.setInt(7, contract.getIdEmployee());
        preparedStatement.setInt(8, contract.getId());
        return preparedStatement.executeUpdate() > 0;
    }
}
