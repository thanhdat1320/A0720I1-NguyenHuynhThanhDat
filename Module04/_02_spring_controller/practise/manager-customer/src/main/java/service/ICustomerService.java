package service;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    void  saveCustomer(Customer customer);

    Customer getCustomerById(String id);

    List<Customer> getAllCustomer();

    boolean deleteCustomer(String id);

    boolean updateCustomer(Customer customer);
}
