package dl.thanhdat.repository.impl;

import dl.thanhdat.model.Customer;
import dl.thanhdat.repository.ICustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepositoryImpl implements ICustomerRepository {
    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Customer customer) {

    }

    @Override
    public void remove(int id) {

    }
}
