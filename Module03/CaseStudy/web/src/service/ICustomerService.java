package service;

import model.CS_Customer;
import model.dto.CS_CustomerUseDTO;
import model.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerService {
    void saveCustomer(CS_Customer customer) throws SQLException;

    CS_Customer getCustomerById(int id) throws SQLException;

    List<CS_Customer> getAllCustomer() throws SQLException;

    boolean deleteCustomer(int id) throws SQLException;

    boolean updateCustomer(CS_Customer customer, int id) throws SQLException;

    List<CustomerDTO> getAllCustomerDTO() throws SQLException;

    List<CustomerDTO> searchCustomerDTO(String name) throws  SQLException;

    List<CS_CustomerUseDTO> getAllCustomerUseService() throws SQLException;
}
