package dao;

import model.CS_Customer;
import model.dto.CS_CustomerUseDTO;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerDAO {

    void saveCustomer(CS_Customer customer) throws SQLException;

    CS_Customer getCustomerById(int id) throws SQLException;

    List<CS_Customer> getAllCustomer() throws SQLException;

    boolean deleteCustomer(int id) throws SQLException;

    boolean updateCustomer(CS_Customer customer) throws SQLException;

    List<CS_CustomerUseDTO> getAllCustomerUseService() throws SQLException;

}
