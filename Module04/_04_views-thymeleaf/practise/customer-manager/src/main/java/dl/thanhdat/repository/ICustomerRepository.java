package dl.thanhdat.repository;

import dl.thanhdat.model.Customer;

import java.util.List;

public interface ICustomerRepository extends IRepository<Customer>{
    @Override
    List<Customer> findAll();

    @Override
    void save(Customer customer);

    @Override
    Customer findById(int id);

    @Override
    void update(int id, Customer customer);

    @Override
    void remove(int id);
}
