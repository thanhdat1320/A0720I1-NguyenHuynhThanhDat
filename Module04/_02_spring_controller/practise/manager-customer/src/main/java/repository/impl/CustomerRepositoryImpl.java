package repository.impl;

import model.Customer;
import org.springframework.stereotype.Repository;
import repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerRepositoryImpl implements ICustomerRepository {
    static Map<String, Customer> listCustomer;
    static {
        listCustomer = new HashMap<>();
        listCustomer.put("1", new Customer("1", "Nam", "", ""));
        listCustomer.put("2", new Customer("2", "Viet", "", ""));
        listCustomer.put("3", new Customer("3", "Phat", "", ""));
        listCustomer.put("4", new Customer("4", "Dat", "", ""));
    }

    @Override
    public void saveCustomer(Customer customer) {
        listCustomer.put(customer.getId(), customer);
    }

    @Override
    public Customer getCustomerById(String id) {
        return listCustomer.get(id);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return new ArrayList<>(listCustomer.values());
    }

    @Override
    public boolean deleteCustomer(String id) {
        return listCustomer.remove(id, this.getCustomerById(id));
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        listCustomer.replace(customer.getId(), customer);
        return true;
    }
}
