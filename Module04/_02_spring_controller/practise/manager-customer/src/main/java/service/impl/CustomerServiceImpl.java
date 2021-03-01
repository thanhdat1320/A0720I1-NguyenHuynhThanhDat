package service.impl;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ICustomerRepository;
import service.ICustomerService;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public void saveCustomer(Customer customer) {
        this.iCustomerRepository.saveCustomer(customer);
    }

    @Override
    public Customer getCustomerById(String id) {
        return this.iCustomerRepository.getCustomerById(id);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return this.iCustomerRepository.getAllCustomer();
    }

    @Override
    public boolean deleteCustomer(String id) {
        return this.iCustomerRepository.deleteCustomer(id);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return this.iCustomerRepository.updateCustomer(customer);
    }
}
