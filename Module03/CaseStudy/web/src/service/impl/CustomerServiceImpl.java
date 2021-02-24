package service.impl;

import dao.ICustomerDAO;
import dao.impl.CustomerDAOImpl;
import model.CS_Customer;
import model.dto.CS_CustomerUseDTO;
import model.CS_TypeCustomer;
import model.dto.CustomerDTO;
import service.ICustomerService;
import service.ICustomerTypeService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerDAO customerDAO = new CustomerDAOImpl();
    private ICustomerTypeService typeCustomerService = new CustomerTypeServiceImpl();

    @Override
    public void saveCustomer(CS_Customer customer) throws SQLException {
        this.customerDAO.saveCustomer(customer);
    }

    @Override
    public CS_Customer getCustomerById(int id) throws SQLException {
        return this.customerDAO.getCustomerById(id);
    }

    @Override
    public List<CS_Customer> getAllCustomer() throws SQLException {
        return this.customerDAO.getAllCustomer();
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        return this.customerDAO.deleteCustomer(id);
    }

    @Override
    public boolean updateCustomer(CS_Customer customer, int id) throws SQLException {
        return this.customerDAO.updateCustomer(customer);
    }

    @Override
    public List<CustomerDTO> getAllCustomerDTO() throws SQLException {
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        List<CS_Customer> customerList = this.customerDAO.getAllCustomer();

        for(CS_Customer customer : customerList) {
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setId(customer.getId());
            customerDTO.setName(customer.getName());
            customerDTO.setIdTypeCustomer(customer.getIdTypeCustomer());

            CS_TypeCustomer typeCustomer = this.typeCustomerService.getTypeCustomerById(customer.getIdTypeCustomer());
            customerDTO.setNameTypeCustomer(typeCustomer.getName());

            customerDTOList.add(customerDTO);
        }
        return customerDTOList;
    }

    @Override
    public List<CustomerDTO> searchCustomerDTO(String name) throws SQLException {
        return this.getAllCustomerDTO()
                .stream()
                .filter(customerDTO -> customerDTO.getName().contains(name))
                .collect(Collectors.toList());
    }

    @Override
    public List<CS_CustomerUseDTO> getAllCustomerUseService() throws SQLException {
        return this.customerDAO.getAllCustomerUseService();
    }
}

